import java.util.Arrays;

public class FindtheSmallestDivisorGivenaThreshold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(smallestDivisor(new int[] {1,2,5,9}, 6));
	}
	
	private static int smallestDivisor(int[] nums, int threshold) {
        int left = 1, right = nums[nums.length - 1];
        
        while(left < right){
            int mid = left + (right - left) / 2;
            int sum = 0;
            
            for(int num: nums){
//                sum += ((int)(Math.ceil((double)num /(double) mid)));
            	sum += (num + mid - 1) / mid;
            }
            
            if(sum == threshold) return mid;
            else if(sum > threshold) left = mid + 1;
            else right = mid;
        }
        return left;
	}

}
