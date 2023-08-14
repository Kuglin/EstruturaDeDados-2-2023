package main;

import classes.Grafo;
import java.util.ArrayList;
import classes.Vertice;

public class Main {
    public static void main(String[] args) {
        Grafo g = new Grafo();
        g.insereV();
        g.insereV();

        ArrayList<Vertice> v = g.vertices();

        g.insereA(v.get(0), v.get(1));
        g.removeV(v.get(0));

        v = g.vertices();

        for (Vertice vertice : v) {
            System.out.println( Integer.toString(vertice.getId()) + " ");
        }
        
    }

}
