public class MajorityElement {
    public static void main(String[] args) {
        System.out.println(majorityElement(new int[]{3,2,3}));
    }

    private static int majorityElement(int[] nums) {
        return searchInRange(nums, 0, nums.length - 1);
    }

    private static int searchInRange(int[] nums, int start, int end){
        if(start == end) return nums[start];

        int mid = start + (end - start) / 2;

        int left = searchInRange(nums, start, mid);
        int right = searchInRange(nums, mid + 1, end);

        if(left == right) return left;

        int leftCount = countNum(nums, left, start, mid);
        int rightCount = countNum(nums, right, mid + 1, end);

        return (leftCount > rightCount) ? left : right;
    }

    private static int countNum(int[] nums, int num, int start, int end){
        int count = 0;
        for(int i = start; i <= end; i++){
            if(nums[i] == num) count++;
        }
        return count;
    }
}
