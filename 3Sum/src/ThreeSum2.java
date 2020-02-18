import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {-1,0,1,2,-1,-4};
		System.out.println(threeSum(nums));
	}

	private static List<List<Integer>> threeSum(int[] nums) {
		// TODO Auto-generated method stub
		Arrays.sort(nums);
		List<List<Integer>> l = new ArrayList<List<Integer>>();
		
		for(int i = 0; i < nums.length - 2; i++) {
			if(i == 0 || (i > 0 && nums[i] != nums[i - 1])) {
				int low = i + 1, high = nums.length - 1, sum = 0 - nums[i];
				
				while(low < high) {
					if(nums[low] + nums[high] == sum) {
						l.add(Arrays.asList(nums[low], nums[high], nums[i]));
						while(low < high && nums[low] == nums[low + 1]) low++;
						while(low < high && nums[high] == nums[high - 1]) high--;
						low++;
						high--;
					}else if(nums[low] + nums[high] < sum) low++;
					else high--;
				}
			}
		}
		return l;
	}

}
