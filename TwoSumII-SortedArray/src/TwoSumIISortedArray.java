
public class TwoSumIISortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {2,7,11,15};
		int target = 9;
		int[] result = twoSum(nums, target);
		for(int num: result) {
			System.out.println(num);
		}
	}
	
	private static int[] twoSum(int[] nums, int target) {
		int start = 0, end = nums.length-1;
		
		while(start < end) {
			if(nums[start] + nums[end] > target) end--;
			else if(nums[start] + nums[end] < target) start++;
			else return new int[] {++start, ++end};
		}
		throw new IllegalArgumentException("incorrect Array");
	}

}
