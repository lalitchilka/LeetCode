import java.util.LinkedList;
import java.util.List;

public class AddtoArrayFormofInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] A = new int[] {2,1,5};
		int K = 806;
		System.out.println(addToArrayForm(A, K));

	}
	
	private static List<Integer> addToArrayForm(int[] A, int K) {
		LinkedList<Integer> arr = new LinkedList<Integer>();
		for(int i = A.length-1; i>=0; i--) {
			K += A[i];
			arr.addFirst(K % 10);
			K /= 10;
		}
		
		while(K > 0) {
			arr.addFirst(K % 10);
			K /= 10;
		}
		return arr;
	}

}
