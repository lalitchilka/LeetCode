
public class MaxAreaofIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] grid = new int [][] {{1,1,0,0,0}, {1,1,0,0,0}, {0,0,0,1,1}, {0,0,0,1,1}};
		System.out.println(maxAreaOfIsland(grid));
	}
	
	static int maxArea = 0;
	private static int maxAreaOfIsland(int[][] grid) {
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				maxArea = Math.max(maxArea, calculateArea(grid, i, j));
			}
		}
		return maxArea;
	}
	
	private static int calculateArea(int[][] grid, int i, int j) {
		if(i < grid.length && j < grid[0].length && i >= 0 && j >= 0 && grid[i][j] == 1) {
			grid[i][j] = 0;
			return (1 + calculateArea(grid, i, j + 1) + calculateArea(grid, i, j - 1) + 
					calculateArea(grid, i + 1, j) + calculateArea(grid, i - 1, j));
		}
		return 0;
	}

}
