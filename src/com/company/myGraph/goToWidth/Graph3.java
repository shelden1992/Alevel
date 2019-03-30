package com.company.myGraph.goToWidth;

import java.util.ArrayDeque;
import java.util.Deque;

public class Graph3 {
    Vertex[] vertices;
    int[][] matrix;
    private int count;


    public Graph3(int n) {
        this.vertices=new Vertex[n];
        this.matrix=new int[n][n];
    }

    public void createVertex(String s) {

        vertices[count++]=new Vertex(s);

    }

    public void createMatrix(int startVertex, int andVertex) {
        matrix[startVertex][andVertex]=1;
        matrix[andVertex][startVertex]=1;
    }

    public int checkVertexТeighbors(int currentVertex) {
        for (int i=0; i < count; i++) {
            if (!vertices[i].isVisited() && matrix[currentVertex][i] == 1) {
                return i;
            }


        }
        return -1;
    }


    public void goToWidth(int startVete) {
        System.out.println("stat my day from " + vertices[startVete].getLabel() );
        int cuurenVertex;
        Deque<Integer> deque=new ArrayDeque<>();
        vertices[startVete].setVisited(true);
        deque.addLast(startVete);


        while (!deque.isEmpty()) {

            while (( cuurenVertex=checkVertexТeighbors(deque.pop()) ) != -1) {

                vertices[cuurenVertex].setVisited(true);
                System.out.println(vertices[cuurenVertex].getLabel() + " -> ");
                deque.addLast(cuurenVertex);
            }
        }

    }


    public static void main(String[] args) {

        Graph3 gr =  new Graph3(100);
        gr.createVertex("Проснулся");
        gr.createVertex( "Встал");
        gr.createVertex("Поел");
        gr.createVertex("Покурил");
        gr.createVertex("Посмотрел новости");


        gr.createMatrix(0,1); // =1
        gr.createMatrix(1,2);
        gr.createMatrix(1,3);
        gr.createMatrix(2,3);
        gr.createMatrix(2,4);
        gr.createMatrix(3,4);

        gr.goToWidth(0);





    }
}
