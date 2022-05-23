import java.util.Arrays;

public class Grafo {
    public static class Graph {
        int vertices;
        int[][] adjacencylist;

        Graph(int vertices) {
            this.vertices = vertices;
            adjacencylist = new int[vertices][vertices];
            for (int[] row : adjacencylist)
                Arrays.fill(row, 9999);
        }

        public Graph() {
            this.vertices = 0;
        }

        public void addEgde(int v, int w, int weight) {
            adjacencylist[v][w] = weight;
        }

        public void printGraph() {
            // Integer[][] matrix = new Integer[vertices][vertices];
            for (int i = 0; i < vertices; i++) {
                for (int j = 0; j < adjacencylist.length; j++) {
                    System.out.println(i + " " +
                            j + " " + adjacencylist[i][j]);
                }
            }
        }
    }
}