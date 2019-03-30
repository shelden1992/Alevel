package com.company.myGraph;

import com.company.myGraph.goToWidth.Vertex;

import java.util.ArrayDeque;
import java.util.Stack;

public class Graph {
    private Vertex[] vertexArray; // хранить все верхушки массива
    private int[][] matrix; //матрица смежности


    private int count; //количество вершин

    public Graph(int n) { //
        this.vertexArray=new Vertex[n];// инициализируем массив, где будем хранить верхушки
        this.matrix=new int[n][n];  // и создаем матрицу смежности

    }

    public void insertVertex(String key) {  //добавления верхушки в массив верхушек
        Vertex v=new Vertex(key);
        vertexArray[count++]=v;
    }

    public void insertEdge(int begin, int end) // создаем новое ребро между begin и end (так-как реализация ненапрвленного графа,
    //то  begin-end == end-begin )
//    В качестве параметра метод принимает индексы начальной и конечной !!!Вершины!!!,
//    которые нужно соединить между собой ребром. Эти индексы соответствуют индексам вершин
//    из вспомогательного массива vertexArray.

    {
        matrix[begin][end]=1;
        matrix[end][begin]=1;
    }

//    Следующим шагом читаем вершину из стека и ищем смежные непосещенные вершины уже для нее.
//    Для этого реализуем отдельно метод getUnvisitedVertex():

    private int getUnvisitedVertex(int vertex) //возвращает index по осси X, если нашел ребро
{
    for(int i = 0; i < count; i++)
        if(matrix[vertex][i] == 1 && !vertexArray[i].isVisited()) {
            return i;
        }

    return -1;
}

    public void dfs(int v)   //обход в глубину: логика нужно 1-й элемент пометить, как просмотрен, добавить его в стек,
//            потом зайти а матрицу смежности и посмотреть с кем у него есть ребро "1", и спросить данная вершина еще не посещалась?
            // если выполн два этих условий, то отметить эту вершину, как просмотренную, и добавить ее на вершину стека,
//            а если мы не нашли вершину соедененую с ней ребром, то нужно удалить данную вершину, и вернутся к предидущ вершину.

    {


        Stack<Integer> stack =new Stack<>();

        System.out.print("Выполняем обход в глубину: " + vertexArray[v].getLabel() + " -> ");
        vertexArray[v].setVisited(true);
        stack.push(v);
        while(!stack.isEmpty())
        {
            int adjVertex = getUnvisitedVertex( (int)stack.peek());
            if(adjVertex == -1)
                stack.pop();
            else{
                vertexArray[adjVertex].setVisited(true);
                System.out.print(vertexArray[adjVertex].getLabel() + " -> ");
                stack.push(adjVertex);
            }
        }

        for(Vertex vertex: vertexArray)
            vertex.setVisited(false);
        System.out.println("все элементы закончились");
    }

    public void bfs(int v)// смысл обхода в ширину: берем 1-й элемент, отмечаем его как пройденный, и добовляем в конец очереди те вершины,
            // с которыми у данной вершины есть ребра, потом удаляем данную вершину и берем 1-й элемент из очереди, и повторяем до тех пор, пока у нас
            // очередь не опустеет.
    {
        System.out.print("Выполняем обход в ширину: " + vertexArray[v].getLabel() + " -> ");
        vertexArray[v].setVisited(true);
        int vertex;
        ArrayDeque<Integer> queue = new ArrayDeque<>();
        queue.addLast(v);
        while(!queue.isEmpty())
        {
            int currentVertex = queue.pop();//берет [1] первый элемент из очереди, не последний и удаляет его size--!

            while((vertex = getUnvisitedVertex(currentVertex)) != -1)  //
            {
                vertexArray[vertex].setVisited(true);
                System.out.print(vertexArray[vertex].getLabel() + " -> ");
                queue.addLast(vertex);
            }
        }
    }




    public static void main(String[] args) {
        Graph graph=new Graph(6);
        graph.insertVertex("A"); //0
        graph.insertVertex("B"); //1
        graph.insertVertex("C"); //2
        graph.insertVertex("D"); //3
        graph.insertVertex("E"); //4
        graph.insertVertex("F"); //5

//        {}

        graph.insertEdge(0, 1);
        graph.insertEdge(0, 2);
        graph.insertEdge(2, 3);
        graph.insertEdge(3, 4);
        graph.insertEdge(4, 5);
        graph.insertEdge(5, 1);

        graph.dfs(0);
        graph.bfs(0);

//        System.out.println(graph.getUnvisitedVertex(2));

    }



}
//  Под обходом графа понимается нахождение всех вершины, достижимых из некоторой начальной вершины.
//  Например, мы хотим узнать, в какие города мы можем попасть из города, где сейчас находимся.
//  Существует два основных алгоритма обхода — обход в глубину и обход в ширину.


