public class SearchinRotatedSortedArray3 {
    public static void main(String[] args) {
        System.out.println(search(new int[]{4,5,6,7,0,1,2}, 0));
    }

    private static int search(int[] nums, int target) {
        int start = 0, n = nums.length, end = n - 1;

        while(start < end){
            int mid = start + (end - start) / 2;
            if(nums[mid] == target) return mid;
            if(nums[mid] > nums[end]) start = mid + 1;
            else end = mid;
        }

        int pivot = 0;
        start = 0;
        end = n - 1;
        // realMid will be mid of long array i.e. (p+(e + p))%n
        while(start <= end){
            int mid = start + (end - start) / 2;
            int realMid = (pivot + mid) % n;
            if(nums[realMid] == target) return realMid;
            if(nums[realMid] < target) start = mid + 1;
            else end = mid - 1;
        }
        return -1;
    }
}
