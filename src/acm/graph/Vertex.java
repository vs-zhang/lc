package acm.graph;

public class Vertex {
    public Vertex(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    private String id;
    private String name;

    @Override
    public boolean equals(Object obj) {
        return false;
    }
}
