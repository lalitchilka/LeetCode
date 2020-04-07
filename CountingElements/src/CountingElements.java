import java.util.HashSet;
import java.util.Set;

public class CountingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(countElements(new int[] {1,1,2,2}));
	}
	
	private static int countElements(int[] arr) {
		Set<Integer> set = new HashSet<>();
		int count = 0;
		for(int a: arr) set.add(a);
		for(int i = 0; i < arr.length; i++) {
			if(set.contains(arr[i] + 1)) count++;
		}
		return count;
	}

}
