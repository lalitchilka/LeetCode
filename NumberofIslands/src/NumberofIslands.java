
public class NumberofIslands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] grid = new char[][] {{'1', '1'}};
		System.out.println(numIslands(grid));
	}
	
	private static int numIslands(char[][] grid) {
		int count = 0;
		for(int i = 0; i < grid.length; i++) {
			for(int j = 0; j < grid[0].length; j++) {
				if (grid[i][j] == '1') {
					count++;
					replaceOneWithZero(grid, 0, 0);
				}
			}
		}
		return count;
	}

	private static void replaceOneWithZero(char[][] grid, int i, int j) {
		// TODO Auto-generated method stub
		if(i >= grid.length || j >= grid[0].length || i < 0 || j < 0 || grid[i][j] == '0') return;
		grid[i][j] = '0';
		
		replaceOneWithZero(grid, i, j - 1);
		replaceOneWithZero(grid, i, j + 1);
		replaceOneWithZero(grid, i - 1, j);
		replaceOneWithZero(grid, i + 1, j);
	}

}
