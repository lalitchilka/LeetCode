import java.util.Arrays;
import java.util.List;

public class MatrixAPI implements BinaryMatrix {
    public int[][] matrix = new int[][] {
            {0,0,0,1},
            {0,1,1,1},
            {0,0,1,1}
    };
    @Override
    public int get(int x, int y) {
        return matrix[x][y];
    }

    @Override
    public List<Integer> dimensions() {
        return Arrays.asList(matrix.length, matrix[0].length);
    }
}
