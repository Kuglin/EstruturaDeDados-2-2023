package classes;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Busca {
    
    public HashMap<Vertice, Vertice> bfs(Grafo g, Vertice r) {

        HashMap<Vertice, Integer> estado = new HashMap<>();         // Estado do Vertice, 0 = Não Visitado, 1 = Visitado, 2 = Encerrado
        HashMap<Vertice, Vertice> p = new HashMap<>();              // Predecessor do Vertice
        HashMap<Vertice, Integer> d = new HashMap<>();              // Distancia em Arrestas percorridas

        Queue<Vertice> f = new LinkedList<>();

        for (Vertice v: g.vertices()) {
            estado.put(v, 0);
            p.put(v, null);
            d.put(v, Integer.MAX_VALUE);
        }

        d.put(r, 0);
        estado.put(r, 1);
        f.add(r);

        Vertice vi;

        while (f.size() != 0) {

            vi = f.remove();
            for (Vertice vj : g.adj(vi)) {
                if (estado.get(vj) == 0) {
                    f.add(vj);
                    estado.put(vj, 1);
                    p.put(vj, vi);
                    d.put(vj, d.get(vj) + 1);

                }
            }
            estado.put(vi, 2);

        }
        
        return p;
    };

    public HashMap<Vertice, Vertice> dfs (Grafo g, Vertice r) {

        HashMap<Vertice, Integer> estado = new HashMap<>();
        HashMap<Vertice, Vertice> p = new HashMap<>();

        for (Vertice v : g.vertices()) {
            estado.put(v, 0);
            p.put(v, null);            
        }

        return visitaVertice(r, estado, p, g);
    }

    public HashMap<Vertice, Vertice> visitaVertice(Vertice v, HashMap<Vertice, Integer> estado, HashMap<Vertice, Vertice> p, Grafo g) {

        estado.put(v, 1);

        for (Vertice vj : g.adj(v)) {
            if (estado.get(vj) == 0) {
                p.put(vj, v);
                visitaVertice(vj, estado, p, g);
            }

        }

        estado.put(v, 2);

        return p;
    }

}
