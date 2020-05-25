public class MoveZeroes2 {
    public static void main(String[] args) {
        int[] result = moveZeroes(new int[] {0,1,0,3,12});
        for(int i: result) System.out.println(i);
    }

    private static int[] moveZeroes(int[] nums) {
        int index = 0;
        for(int i = 0; i < nums.length; i++) if(nums[i] != 0) nums[index++] = nums[i];

        for(int i = index; i < nums.length; i++) nums[i] = 0;
        return nums;
    }
}
