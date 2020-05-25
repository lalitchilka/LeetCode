public class SingleElementinaSortedArray2 {
    public static void main(String[] args) {
        //Solution with O(logn) time;
        System.out.println(singleNonDuplicate(new int[]{1,1,2,3,3,4,4,8,8}));
    }

    private static int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length - 1;
        while(start < end){
            int mid = start + (end - start) / 2;
            if(mid % 2 == 0){
                if(nums[mid + 1] == nums[mid]) start = mid + 1;
                else end = mid;
            }else{
                if(nums[mid - 1] == nums[mid]) start = mid + 1;
                else end = mid;
            }
        }
        return nums[start];
    }
}
