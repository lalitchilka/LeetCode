public class SearchinRotatedSortedArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {4,5,6,7,0,1,2};
		System.out.println(search(nums, 6));
	}
	
	private static int search(int[] nums, int target) {
		int n = nums.length, start = 0, end = n - 1;
		
		//first binary search to find the pivot point i.e. smallest element
		while(start < end) {
			int mid = start + (end - start) / 2;
			if(nums[mid] == target) return mid;
			if(nums[mid] > nums[end]) start = mid + 1;
			else end = mid;
		}
		
		int pivot = start;
		start = 0; end = n - 1;
		
		//second binary search for finding number. realmid will be mid of longer array i.e. (p + (e + p)) / 2
		while(start <= end) {
			int mid = start + (end - start) / 2;
			int realMid = (pivot + mid) % n;
			if(nums[realMid] == target) return realMid;
			if(nums[realMid] < target) start = mid + 1;
			else end = mid - 1;
		}
		return -1;
	}

}
