package classes;

import java.util.ArrayList;
import java.util.HashMap;

public class Grafo {

    public Grafo() {
    }

    private int contIdV = 0;
    private int contIdA = 0;

    private ArrayList<Vertice> vertices = new ArrayList<>();

    public int getOrdem() {

        return vertices.size();

    }

    public int getTamanho() {

        int cont = 0;

        for (Vertice v : vertices)
            cont += v.getArestas().size();
        
        return cont/2;

    }

    public ArrayList<Vertice> vertices() {

        return vertices;

    }

    public ArrayList<Aresta> arestas() {
        ArrayList<Integer> idArestas = new ArrayList<Integer>();
        ArrayList<Aresta> objAresta = new ArrayList<>();
        for (Vertice v : vertices) {
            for (Aresta a : v.getArestas().values()) {
                if (!(idArestas.contains(a.getId()))) {
                    idArestas.add(a.getId());
                    objAresta.add(a);
                }
            }
        }
        return objAresta;
    }

    public void insereV() {

        Vertice v = new Vertice(contIdV);
        contIdV++;
        
        vertices.add(v);

    }

    public void insereA (Vertice u, Vertice v) {
        Aresta aresta = new Aresta(contIdA, u, v);
        contIdA++;
        u.getArestas().put(v, aresta);
        v.getArestas().put(u, aresta);
    }

    public void removeV (Vertice u) {
        
        HashMap<Vertice, Aresta> arestas = u.getArestas();
        for (Vertice v: vertices) {
            if (arestas.containsKey(v)){
                arestas.remove(v);
            }
        }

        vertices.remove(u);

    }

    public ArrayList<Vertice> adj(Vertice v) {

        ArrayList<Vertice> adjacentes = new ArrayList<Vertice>();

        HashMap<Vertice, Aresta> arestas = v.getArestas();

        for (Vertice i : arestas.keySet()) {
            adjacentes.add(i);
        }
    
        return adjacentes;
        
    }

    public Aresta getA(Vertice u, Vertice v) {

        return u.getArestas().get(v);

    }

    public int grau(Vertice v) {

        return v.getArestas().size();
    }

    public Vertice[] verticesA(Aresta e) {
        Vertice[] retorno = new Vertice[2];
        retorno[0] = e.getV1();
        retorno[1] = e.getV2();

        return retorno;
    }

    public Vertice oposoto(Vertice v, Aresta e) {
        if (v == e.getV1())
            return e.getV1();

        else if (v == e.getV2())
            return e.getV2();
        
        return null;




    }

}
