import java.util.Arrays;

public class LongestIncreasingSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {10,9,2,5,3,7,101,18};
		System.out.println(lengthOfLIS(nums));
	}
	
	private static int lengthOfLIS(int[] nums) {
		int[] arr = new int[nums.length];
		Arrays.fill(arr, 1);
		int max = 1;
		
		for(int j = 1; j < nums.length; j++) {
			for(int i = 0; i < j; i++) {
				if(nums[i] < nums[j]) {
					arr[j] = Math.max(arr[j], arr[i]+1);
				}
			}
			max = Math.max(arr[j], max);
		}
		return max;
	}

}
