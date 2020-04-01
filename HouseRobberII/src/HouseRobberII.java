import java.util.Arrays;

public class HouseRobberII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,2,3,1};
		System.out.println(rob(nums));
	}
	
	private static int rob(int[] nums) {
		if(nums.length == 0 || nums == null) return 0;
		if(nums.length == 1) return nums[0];
		return Math.max(rob1(Arrays.copyOfRange(nums, 0, nums.length - 1)),
				rob1(Arrays.copyOfRange(nums, 1, nums.length)));
	}
	
	private static int rob1(int[] nums) {
		int[] dp = new int[nums.length + 1];
		dp[0] = 0;
		dp[1] = nums[0];
		for(int i = 1; i < nums.length; i++) {
			dp[i + 1] = Math.max(dp[i], dp[i - 1] + nums[i]);
		}
		return dp[dp.length - 1];
	}

}
