
public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {-2,1,-3,4,-1,2,1,-5,4};
		System.out.println(maxSubArray(nums));
	}
	
	private static int maxSubArray(int[] nums) {
		if(nums.length == 1) return nums[0];
		int[] arr = new int[nums.length + 1];
		arr[0] = nums[0];
		int max = nums[0];
		for(int i = 1; i < nums.length; i++) {
			arr[i] = Math.max(nums[i], nums[i] + arr[i - 1]);
			max = Math.max(max, arr[i]);
		}
		return max;
	}

}
