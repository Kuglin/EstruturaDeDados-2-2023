package main;

import classes.Grafo;
import java.util.ArrayList;
import java.util.HashMap;

import classes.Vertice;
import classes.Busca;

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
        g.insereA(v.get(0), v.get(2));
        g.insereA(v.get(2),v.get(3));
        g.insereA(v.get(2), v.get(4));
        g.insereA(v.get(2), v.get(5));

        Busca b = new Busca();
        HashMap<Vertice, Vertice> busca = b.dfs(g, v.get(0));
        System.out.println(busca.toString()); 

    }

}
