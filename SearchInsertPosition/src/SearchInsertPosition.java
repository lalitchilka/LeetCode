
public class SearchInsertPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1,3,5,6};
		System.out.println(searchInsert(nums, 2));
	}
	
	private static int searchInsert(int[] nums, int target) {
		if(target < nums[0]) return 0;
		if(target > nums[nums.length - 1]) return nums.length;
		
		int start = 0, end = nums.length - 1;
		
		while(start < end) {
			int mid = start + (end - start) / 2;
			if(nums[mid] == target) return mid;
			else if(nums[mid] < target) start = mid + 1;
			else end = mid;
		}
		return start;
	}

}
