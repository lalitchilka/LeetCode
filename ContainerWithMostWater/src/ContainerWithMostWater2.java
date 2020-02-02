
public class ContainerWithMostWater2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] height = new int[] {1,8,6,2,5,4,8,3,7};
		System.out.println(maxArea(height));
	}
	
	// Brute Force
	private static int maxArea(int[] height) {
		int mArea = 0;
		for(int i = 0; i < height.length - 1; i++) {
			for(int j = 0; j < height.length; j++) {
				mArea = Math.max(mArea, (j - i) * Math.min(height[i], height[j]));
			}
		}
		return mArea;
	}

}
