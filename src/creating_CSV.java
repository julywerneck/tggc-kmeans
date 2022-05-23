import java.io.RandomAccessFile;
import java.io.IOException;

public class creating_CSV {
    static RandomAccessFile csvWriter;

    public static void create(int matrix[][], int nV) throws IOException {
        csvWriter = new RandomAccessFile("matriz.csv", "rw");
        for (int i = 0; i < nV; ++i) {
            csvWriter.seek(csvWriter.length());
            String data = "";
            for (int j = 0; j < nV; ++j) {
                if (matrix[i][j] == 9999)
                    data += "INF,";
                else if (i == j) {
                    data += "0,";
                } else {
                    data += (matrix[i][j] + ",");
                }
            }
            System.out.print(data);
            csvWriter.writeUTF(data + "\n");
        }
        csvWriter.close();
    }
}
