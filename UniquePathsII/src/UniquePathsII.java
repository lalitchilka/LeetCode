
public class UniquePathsII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = new int[][] {{0,0,0}, {0,1,0}, {0,0,0}};
		System.out.println(uniquePathsWithObstacles(arr));
	}
	
	private static int uniquePathsWithObstacles(int[][] arr) {
		if(arr[0][0] == 1) return 0;
		
		int w = arr[0].length;
		int h = arr.length;
		int[][] result = new int[h][w];
		
		for(int i = 1; i < arr.length; i++) {
			if(arr[i][0] == 0) result[i][0] = 1;
			else {
				break;
			}
		}
		
		for(int j = 1; j < arr[0].length; j++) {
			if(arr[0][j] == 0) result[0][j] = 1;
			else {
				break;
			}
		}
		
		for(int i = 1; i < arr.length; i++) {
			for(int j = 1; j < arr[0].length; j++) {
				if(arr[i][j] == 1) {
					result[i][j] = 0;
					continue;
				}
				result[i][j] = result[i][j - 1] + result[i - 1][j];
			}
		}
		return result[h - 1][w - 1];
	}

}
