
public class ProductofArrayExceptSelf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,2,3,4};
		int[] result = productExceptSelf(nums);
		for(int i: result) {
			System.out.println(i);
		}
	}
	
	private static int[] productExceptSelf(int[] nums) {
		int n = nums.length;
		int[] result = new int[n];
		
		result[0] = 1;
		for(int i = 1; i < n; i++) {
			result[i] = result[i - 1] * nums[i - 1];
		}
		
		int right = 1;
		for(int i = n - 1; i >= 0; i--) {
			result[i] = result[i] * right;
			right = right * nums[i];
		}
		return result;
	}

}
