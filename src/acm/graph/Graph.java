package acm.graph;

import java.util.List;

public class Graph {
    public Graph(List<Vertex> vertexes, List<Edge> edges) {
        this.vertexes = vertexes;
        this.edges = edges;
    }

    public List<Vertex> getVertexes() {
        return vertexes;
    }

    public List<Edge> getEdges() {
        return edges;
    }

    private List<Vertex> vertexes;
    private List<Edge> edges;
}
