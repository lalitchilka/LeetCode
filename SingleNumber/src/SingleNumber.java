public class SingleNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(singleNumber(new int[] {4,1,2,1,2}));
	}
	
	private static int singleNumber(int[] nums) {
		int result = 0;
		for(int i = 0; i < nums.length; i++) {
			result = result ^ nums[i];
		}
		return result;
	}

}
