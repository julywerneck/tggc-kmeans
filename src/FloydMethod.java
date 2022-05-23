public class FloydMethod {
  public static class FloydWarshall {
    int INF = 9999;
    int nV = 0;
    int matrix[][];

    // Implementing floyd warshall algorithm
    FloydWarshall(int graph[][], int vertices) {
      this.nV = vertices;
      this.matrix = new int[vertices][vertices];

      for (int i = 0; i < this.nV; i++)
        for (int j = 0; j < this.nV; j++)
          matrix[i][j] = graph[i][j];
    }

    public int[][] getMatrix() {
      return this.matrix;
    }

    public void createMatrix() {
      int i, j, k;

      // Adding vertices individually
      for (k = 0; k < this.nV; k++) {
        for (i = 0; i < this.nV; i++) {
          for (j = 0; j < this.nV; j++) {
            if (this.matrix[i][k] + this.matrix[k][j] < this.matrix[i][j])
              this.matrix[i][j] = this.matrix[i][k] + this.matrix[k][j];
          }
        }
      }
      printMatrix();
    }

    void printMatrix() {
      for (int i = 0; i < this.nV; ++i) {
        for (int j = 0; j < this.nV; ++j) {
          if (this.matrix[i][j] == INF)
            System.out.print("INF ");
          else if (i == j) {
            System.out.print("0  ");
          } else {
            System.out.print(this.matrix[i][j] + "  ");
          }
        }
        System.out.println();
      }
    }
  }
}