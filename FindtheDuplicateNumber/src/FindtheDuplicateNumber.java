
public class FindtheDuplicateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,3,4,2,2};
		System.out.println(findDuplicate(nums));
	}
	
	private static int findDuplicate(int[] nums) {
		if(nums.length > 1) {
			int slow = nums[0], fast = nums[nums[0]];
			
			while(slow != fast) {
				slow = nums[slow];
				fast = nums[nums[fast]];
			}
			
			fast = 0;
			
			while(fast != slow) {
				slow = nums[slow];
				fast = nums[fast];
			}
			return slow;
		}
		return -1;
	}

}
