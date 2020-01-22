import java.util.Arrays;

public class FindPivotIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {1, 7, 3, 6, 5, 6};
		System.out.println(pivotIndex(nums));
	}
	
	private static int pivotIndex(int[] nums) {
        
//        for(int i = 1; i < nums.length; i++){
//            int leftsum = sum(Arrays.copyOfRange(nums, 0, i));
//            int rightsum = sum(Arrays.copyOfRange(nums, i+1, nums.length));
//            if(leftsum == rightsum) return i;
//        }
//        return -1;
		int sum = 0, total = 0;
		for(int i = 0; i < nums.length; i++) total += nums[i];
		for(int i = 0; i<nums.length; i++) {
			
			if(sum * 2 == total - nums[i]) return i;
			sum += nums[i];
		}
		return -1;
    }
	
//	private static int sum(int[] arr){
//        int sum = 0;
//        for(int i: arr){
//            sum+=i;
//        }
//        return sum;
//    }

}
