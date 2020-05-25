import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
    public static void main(String[] args) {
        System.out.println(intervalIntersection(new int[][]{{0,2}, {5,10}, {13,23},{24,25}},
                new int[][]{{1,5},{8,12},{15,24},{25,26}}));
    }

    private static int[][] intervalIntersection(int[][] A, int[][] B) {
        int i = 0, j = 0;
        List<int[]> result = new ArrayList<>();
        while(i < A.length && j < B.length){
            int[] a = A[i];
            int[] b = B[j];
            if(a[1] < b[0]) i++;
            else if(b[1] < a[0]) j++;
            else{
                //overlap occurs
                int start = Math.max(a[0], b[0]);
                int end = Math.min(a[1], b[1]);
                result.add(new int[]{start, end});
                if(a[1] < b[1]) i++;
                else if(a[1] >= b[1]) j++;
            }
        }
        return result.toArray(new int[result.size()][]);
    }
}
