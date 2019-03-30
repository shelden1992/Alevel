package com.company.myGraph.dijkstra;

import java.util.*;

//https://www.baeldung.com/java-dijkstra
public class Main {
    public static void main(String[] args) {
        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        nodeA.addDestination(nodeB, 10);  //у каждого узла есть дистанция до следующего
        nodeA.addDestination(nodeC, 15);

        nodeB.addDestination(nodeD, 12);
        nodeB.addDestination(nodeF, 15);

        nodeC.addDestination(nodeE, 10);

        nodeD.addDestination(nodeE, 2);
        nodeD.addDestination(nodeF, 1);

        nodeF.addDestination(nodeE, 5);

        Graph graph = new Graph();

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);
        graph.addNode(nodeE);
        graph.addNode(nodeF);

        graph =  calculateShortestPathFromSource(graph, nodeA);
        System.out.println( nodeE.getShortestPath().toString() + nodeE.toString().substring(0, nodeE.toString().length()-3));
        for (Node n: graph.getNodes()
             ) {
            System.out.print( n.getDistance()+ " ");
        }
    }


    public static Graph calculateShortestPathFromSource(Graph graph, Node source) {
        source.setDistance(0);
        //от первого узла до первого узла дистанция будет очевидно 0!

        Set<Node> settledNodes=new HashSet<>();
        // множество посещенных узлов
        Set<Node> unsettledNodes=new HashSet<>();
        // множество непосещ узлов

        unsettledNodes.add(source);

        while (unsettledNodes.size() != 0) {

            Node currentNode=getLowestDistanceNode(unsettledNodes);  /*возвращает из непосещенного множества
            узел с найменшей дистанцией от данного соседа*/


            unsettledNodes.remove(currentNode);
            for (Map.Entry<Node, Integer> adjacencyPair : currentNode.getAdjacentNodes().entrySet()) {
                Node adjacentNode=adjacencyPair.getKey();
                Integer edgeWeight=adjacencyPair.getValue();
                if (!settledNodes.contains(adjacentNode)) {
                    calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
                    unsettledNodes.add(adjacentNode);
                }
            }
            settledNodes.add(currentNode);
        }
        return graph;
    }


    private static Node getLowestDistanceNode(Set<Node> unsettledNodes) { //проходясь по списку мы ищем
        // найменшую дистанцию от данного узла returns the node with the lowest distance from the unsettled nodes set,
        Node lowestDistanceNode = null;
        int lowestDistance = Integer.MAX_VALUE;
        for (Node node: unsettledNodes) {
            int nodeDistance = node.getDistance();
            if (nodeDistance < lowestDistance) {
                lowestDistance = nodeDistance;
                lowestDistanceNode = node;
            }
        }
        return lowestDistanceNode;
    }



    private static void calculateMinimumDistance(Node evaluationNode, Integer edgeWeigh, Node sourceNode) {

            Integer sourceDistance = sourceNode.getDistance();
            if (sourceDistance + edgeWeigh < evaluationNode.getDistance()) {

                evaluationNode.setDistance(sourceDistance + edgeWeigh);

                LinkedList<Node> shortestPath = new LinkedList<>(sourceNode.getShortestPath());

                shortestPath.add(sourceNode);
                evaluationNode.setShortestPath(shortestPath);
            }
        }


    }


