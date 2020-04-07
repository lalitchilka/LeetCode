public class CapacityToShipPackagesWithinDDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] weights = new int[] {1,2,3,4,5,6,7,8,9,10};
		System.out.println(shipWithinDays(weights, 5));
	}
	
	private static int shipWithinDays(int[] weights, int D) {
		int left = weights[0];
		int right = 0;
		for(int i = 0; i < weights.length; i++) {
			left = Math.min(left, weights[i]);
			right += weights[i];
		}
//		int mid = 0;
		while(left < right) {
			int mid = (left + right) / 2;
			int need = 1;
			int currentWeight = 0;
			
			for(int weight: weights) {
				if(currentWeight + weight > mid) {
					need += 1;
					currentWeight = 0;
				}
				currentWeight += weight;
			}
			
			if(need > D) {
				left = mid + 1;
			}else {
				right = mid;
			}
		}
		return left;
	}

}
