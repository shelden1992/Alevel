package com.company.myGraph.goToWidth;

public class Vertex {
    public boolean isVisited() {
        return visited;
    }

    private boolean visited = false;

    private String label;

    public String getLabel() {
        return label;
    }

    public Vertex(String label) {
        this.label=label;
    }

    public void setVisited(boolean b) {
        this.visited = b;
    }
}
