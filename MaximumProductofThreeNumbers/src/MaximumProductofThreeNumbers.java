import java.util.Arrays;

public class MaximumProductofThreeNumbers {

	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4};
		// TODO Auto-generated method stub
		System.out.println(maximumProduct(nums ));
	}
	
	private static int maximumProduct(int[] nums) {
		Arrays.sort(nums);
		return Math.max(nums[0] * nums[1] * nums[nums.length-1], nums[nums.length-1] * nums[nums.length-2] * nums[nums.length-3]);
	}

}
