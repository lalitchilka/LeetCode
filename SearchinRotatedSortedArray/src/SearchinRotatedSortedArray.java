
public class SearchinRotatedSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {4,5,6,7,0,1,2};
		int target = 1;
		System.out.println(search(nums, target));
	}
	
	private static int search(int[] nums, int target) {
		int start = 0, n = nums.length, end = n - 1;
		
		while(start < end) {
			int mid = start + (end - start) / 2;
			if(nums[mid] > end) start = mid + 1;
			else end = mid;
		}
		
		int pivot = start;
		start = 0; end = n - 1;
		while(start <= end) {
			int mid = (start + end) / 2;
			int realmid = (pivot + mid) % n;
			if(nums[realmid] == target) return realmid;
			if(nums[realmid] < target) start = mid + 1;
			else end = mid - 1;
		}
		return -1;
	}

}
