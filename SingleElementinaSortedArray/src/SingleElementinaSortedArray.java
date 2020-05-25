public class SingleElementinaSortedArray {
    public static void main(String[] args) {
        //Solution with O(n) time;
        System.out.println(singleNonDuplicate(new int[]{3,3,7,7,10,11,11}));
    }

    private static int singleNonDuplicate(int[] nums) {
        int result = 0;
        for(int num: nums){
            result ^= num;
        }
        return result;
    }
}
