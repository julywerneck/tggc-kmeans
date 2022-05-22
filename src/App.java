import java.net.*;
import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            // for (int i = 1; i <= 1; i++) {
            // String counter_to_string = Integer.toString(i);
            // String url_model = "http://people.brunel.ac.uk/~mastjjb/jeb/orlib/files/pmed"
            // + counter_to_string
            // + ".txt";
            // URL url = new URL(url_model);
            // Scanner s = new Scanner(url.openStream());
            // String first_line = s.nextLine();
            // int vertices = Integer.parseInt(first_line.split(" ")[1]);
            // // int k = Integer.parseInt(first_line.split(" ")[3]);
            // Grafo.Graph grafo = new Grafo.Graph(vertices + 1);
            // while (s.hasNextLine()) {
            // String nodes = s.nextLine();
            // int v = Integer.parseInt(nodes.split(" ")[1]);
            // int w = Integer.parseInt(nodes.split(" ")[2]);
            // int weight = Integer.parseInt(nodes.split(" ")[3]);
            // grafo.addEgde(v, w, weight);
            // }
            // }
            int vertices = 6;
            Grafo.Graph grafo = new Grafo.Graph(vertices);
            grafo.addEgde(0, 1, 4);
            grafo.addEgde(0, 2, 3);
            grafo.addEgde(1, 3, 2);
            grafo.addEgde(1, 2, 5);
            grafo.addEgde(2, 3, 7);
            grafo.addEgde(3, 4, 2);
            grafo.addEgde(4, 0, 4);
            grafo.addEgde(4, 1, 4);
            grafo.addEgde(4, 5, 6);
            grafo.printGraph();
            int[][] matrix = grafo.adjacencylist;
            FloydWarshall a = new FloydWarshall();
            a.floydWarshall(matrix, vertices);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
