import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,1,1};
		System.out.println(subarraySum(nums, 2));
	}
	
	private static int subarraySum(int[] nums, int k) {
		int sum = 0, count = 0;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(0, 1);
		for(int i : nums) {
			sum += i;
			
			if(map.containsKey(sum - k)) count += map.get(sum - k);
			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}
		return count;
	}

}
