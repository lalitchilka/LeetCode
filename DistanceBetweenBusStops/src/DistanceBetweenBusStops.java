
public class DistanceBetweenBusStops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] distance = new int[] {1,2,3,4};
		int start = 0;
		int destination = 3;
		System.out.println(distanceBetweenBusStops(distance, start, destination));
	}

	private static int distanceBetweenBusStops(int[] distance, int start, int destination) {
		// TODO Auto-generated method stub
		if(start > destination) {
			int tmp = start;
			start = destination;
			destination = tmp;
		}
		int oneWay = 0;
		for(int i = start; i < destination; i++) {
			oneWay += distance[i];
		}
		int otherWay = 0;
		for(int i = destination; i < distance.length; i++) {
			otherWay += distance[i];
		}
		for(int i = 0; i < start; i++) {
			otherWay += distance[i];
		}
		return Math.min(oneWay, otherWay);
	}

}
