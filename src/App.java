import java.net.*;
import java.util.*;
import java.io.*;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            for (int i = 1; i <= 1; i++) {
                String counter_to_string = Integer.toString(i);
                String url_model = "http://people.brunel.ac.uk/~mastjjb/jeb/orlib/files/pmed"
                        + counter_to_string
                        + ".txt";
                URL url = new URL(url_model);
                Scanner s = new Scanner(url.openStream());
                String first_line = s.nextLine();
                int vertices = Integer.parseInt(first_line.split(" ")[1]);
                int k = Integer.parseInt(first_line.split(" ")[3]);
                Grafo.Graph grafo = new Grafo.Graph(vertices + 1);
                while (s.hasNextLine()) {
                    String nodes = s.nextLine();
                    int v = Integer.parseInt(nodes.split(" ")[1]);
                    int w = Integer.parseInt(nodes.split(" ")[2]);
                    int weight = Integer.parseInt(nodes.split(" ")[3]);
                    grafo.addEgde(v, w, weight);
                }
                int[][] matrix = grafo.adjacencylist;
                FloydMethod.FloydWarshall a = new FloydMethod.FloydWarshall(matrix, vertices);
                a.createMatrix();
                matrix = a.getMatrix();
                Kmeans solver = new Kmeans(grafo, k);
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
