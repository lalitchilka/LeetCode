
public class FindMinimuminRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {3,4,5,1,2};
		System.out.println(findMin(nums));
	}
	
	private static int findMin(int[] nums) {
		int start = 0, end = nums.length - 1;
		if(nums[start] < nums[end]) return nums[start];
		
		while(start < end) {
			int mid = start + (end - start) / 2;
			if(nums[mid] > nums[end]) start = mid + 1;
			else end = mid;
		}
		return nums[start];
	}

}
