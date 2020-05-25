import java.util.List;

public class LeftmostColumnwithatLeastOne_BinarySearchSolution {
    public static void main(String[] args) {
        System.out.println(leftMostColumnWithOne(new MatrixAPI()));
    }

    private static int leftMostColumnWithOne(BinaryMatrix binaryMatrix){
        List<Integer> matrixSize = binaryMatrix.dimensions();
        int rows = matrixSize.get(0);
        int columns = matrixSize.get(1);
        int minIndex = Integer.MAX_VALUE;

        if(rows == 0 || columns == 0) return -1;

        for (int i = 0; i < rows; i++){
            int start = 0, end = columns;
            while(start < end){
                int mid = start + (end - start) / 2;
                int value = binaryMatrix.get(i, mid);
                if(value == 0){
                    start = mid + 1;
                }else{
                    minIndex = Math.min(minIndex, mid);
                    end = mid--;
                }
            }
        }
        return (minIndex == Integer.MAX_VALUE) ? -1 : minIndex;
    }
}
