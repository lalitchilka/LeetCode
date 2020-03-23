import java.util.HashMap;
import java.util.Map;

public class TwoSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int [] {2,7,11,15};
		int target = 9;
		int[] result = twoSum(nums, target);
		System.out.println(result[0] + " " + result[1]);
	}
	
	public static int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 0; i < nums.length; i++) {
			int leftOver = target - nums[i];
			if(map.containsKey(leftOver)) return new int[] {i, map.get(leftOver)};
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No pair foud");
	}

}
