package main;

import classes.Grafo;
import java.util.ArrayList;
import classes.Vertice;

public class Main {
    public static void main(String[] args) {
        Grafo g = new Grafo();
        g.insereV();
        g.insereV();
        g.insereV();
        g.insereV();
        g.insereV();
        g.insereV();

        ArrayList<Vertice> v = g.vertices();

        g.insereA(v.get(0), v.get(1));
        g.insereA(v.get(2), v.get(3));
        g.insereA(v.get(3),v.get(4));
        g.insereA(v.get(5), v.get(1));

        System.out.println(v.toString());
        System.out.println(g.arestas().toString());

        System.out.println(g.adj(v.get(1)).toString());


    }

}
