import java.util.List;

public class LeftmostColumnwithatLeastaOne {
    public static void main(String[] args) {
        System.out.println(leftMostColumnWithOne(new MatrixAPI()));
    }

    private static int leftMostColumnWithOne(BinaryMatrix binaryMatrix) {
        List<Integer> matrixSize = binaryMatrix.dimensions();
        int rows = matrixSize.get(0);
        int columns = matrixSize.get(1);

        if(rows == 0 || columns == 0) return -1;
        int x = 0, y = columns - 1;
        int index = -1;
        while(x < rows && y >= 0){
            if(binaryMatrix.get(x, y) == 1){
                index = y;
                y--;
            }else x++;
        }
        return index;
    }
}
