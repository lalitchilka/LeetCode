
public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {9,6,4,2,3,5,7,0,1};
		System.out.println(missingNumber(nums));
	}
	
	private static int missingNumber(int[] nums) {
		int missingNumber = nums.length;
		for(int i = 0; i<nums.length; i++) {
			missingNumber = missingNumber ^ (i ^ nums[i]);
		}
		return missingNumber;
	}

}
