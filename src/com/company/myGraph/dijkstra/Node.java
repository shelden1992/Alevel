package com.company.myGraph.dijkstra;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Node {

    private String name;

    private List<Node> shortestPath=new LinkedList<>();  //

    private Integer distance=Integer.MAX_VALUE;

    private Map<Node, Integer> adjacentNodes=new HashMap<>(); //примыкающие узлы
    // The adjacentNodes attribute is used to associate immediate neighbors with edge length.
    // This is a simplified implementation of an adjacency list,
    // which is more suitable for the Dijkstra algorithm than the adjacency matrix.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public List<Node> getShortestPath() {
        return shortestPath;
    }

    public void setShortestPath(List<Node> shortestPath) {
        this.shortestPath=shortestPath;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance=distance;
    }

    @Override
    public String toString() {
        final StringBuilder sb=new StringBuilder( );
        sb.append("name '").append(name).append('\'').append(" -> ");
        return sb.toString() ;
    }

    public Map<Node, Integer> getAdjacentNodes() {
        return adjacentNodes;
    }

    public void setAdjacentNodes(Map<Node, Integer> adjacentNodes) {
        this.adjacentNodes=adjacentNodes;
    }

    public void addDestination(Node destination, int distance) {
        adjacentNodes.put(destination, distance);
    }

    public Node(String name) {
        this.name=name;
    }
}
