import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,2,3,1};
		System.out.println(containsDuplicate(nums));
	}
	
	private static boolean containsDuplicate(int[] nums) {
		Set<Integer> set = new HashSet<Integer>();
		for(int i: nums) {
			if(set.contains(i)) return true;
			set.add(i);
		}
		return false;
	}

}
