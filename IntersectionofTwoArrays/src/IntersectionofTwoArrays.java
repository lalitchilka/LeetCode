import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class IntersectionofTwoArrays {

	public static void main(String[] args) {
		int[] nums1 = new int[] {4,9,5};
		int[] nums2 = new int[] {9,4,9,8,4};
		// TODO Auto-generated method stub
		int[] result = intersection(nums1, nums2);
		for (int i : result) {
			System.out.println(i);
		}
	}
	
	private static int[] intersection(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		Set<Integer> set = new HashSet<>();
		int p1 = 0, p2 = 0;
		while(p1 < nums1.length && p2 < nums2.length) {
			if(nums1[p1] == nums2[p2]) {
				set.add(nums1[p1]);
				p1++;
				p2++;
			}
			else if(nums1[p1] < nums2[p2]) p1++;
			else p2++;
		}
		int[] result = new int[set.size()];
		int curr = 0;
		for(Integer i : set) {
			result[curr++] = i;
		}
		return result;
	}

}
