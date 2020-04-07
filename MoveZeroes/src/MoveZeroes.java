
public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {0,1,0,3,12};
		int[] result = moveZeroes(nums);
		for(int i: result) System.out.println(i);
	}
	
	private static int[] moveZeroes(int[] nums) {
		int k = 0;
		for(int i = 0; i < nums.length; i++) {
			if(nums[i] != 0) nums[k++] = nums[i];
		}
		for(int i = k; i < nums.length; i++) nums[i] = 0;
		return nums;
	}

}
