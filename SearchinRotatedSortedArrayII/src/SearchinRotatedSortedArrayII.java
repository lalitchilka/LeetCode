public class SearchinRotatedSortedArrayII {
    public static void main(String[] args) {
        System.out.println(search(new int[]{2,5,6,0,0,1,2}, 3));
    }

    private static boolean search(int[] nums, int target) {
        int start = 0, n = nums.length, end = n - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return true;
            if(nums[mid] > nums[end]){
                start = mid + 1;
                while(start - 1 > 0 && nums[start] == nums[start - 1]) --start;
            }
            else{
                end = mid;
                while(end + 1 < n && nums[end] == nums[end + 1]) ++end;
            }
        }

        int pivot = start;
        start = 0; end = n - 1;

        while(start <= end){
            int mid = start + (end - start) / 2;
            int realMid = (pivot + mid) % n;
            if(nums[mid] == target) return true;
            if(nums[mid] < target){
                start = mid + 1;
                while(mid + 1 > 0 && nums[mid] == nums[mid + 1]) ++start;
            }else{
                end = mid - 1;
                while(mid - 1 > 0 && nums[mid] == nums[mid - 1]) --end;
            }
        }
        return false;
    }
}
