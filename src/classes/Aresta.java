package classes;

public class Aresta {
    

    public Aresta(int id, Vertice v1, Vertice v2) {
        this.v1 = v1;
        this.v2 = v2;
        this.id = id;
    }
    


    private int id;
    private Vertice v1;
    private Vertice v2;

    public Vertice getV1() {
        return v1;
    }

    public void setV1(Vertice v1) {
        this.v1 = v1;
    }

    public Vertice getV2() {
        return v2;
    }

    public void setV2(Vertice v2) {
        this.v2 = v2;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[id=" + id + ", v1=" + v1 + ", v2=" + v2 + "]";
    }

    

}
