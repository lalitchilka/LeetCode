public class FindFirstandLastPositionofElementinSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {5,7,7,8,8,10};
		int target = 6;
		int[] result = searchRange(nums, target);
		for(int i = 0; i < result.length; i++) System.out.println(result[i]);

	}
	
	private static int[] searchRange(int[] nums, int target) {
		int start = 0, end = nums.length - 1;
        if(nums.length == 1 && target == nums[0]) return new int[] {0, 0};
        while(start <= end){
            int mid = start + (end - start) / 2;
            int leftPointer = mid;
            int rightPointer = mid;
            if(nums[mid] == target){
                while(leftPointer > 0 && target == nums[leftPointer - 1]) leftPointer--;
                while(rightPointer < nums.length - 1 && target == nums[rightPointer + 1]) rightPointer++;
                return new int[] {leftPointer, rightPointer};
            }
            if(target >= nums[mid]){
                start = mid + 1;
            }else if(target <= nums[mid]){
                end = mid - 1;
            }
        }
        return new int[]{-1, -1};
	}

}
