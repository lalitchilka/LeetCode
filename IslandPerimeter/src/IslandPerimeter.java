
public class IslandPerimeter {

	public static void main(String[] args) {
		int[][] grid = {{0,1,0,0},{1,1,1,0},{0,1,0,0},{1,1,0,0}};
		// TODO Auto-generated method stub
		System.out.println(islandPerimeter(grid ));
	}
	
	private static int islandPerimeter(int[][] grid) {
        int islands = 0, neighbour = 0;
        for(int i = 0; i<grid.length; i++){
            for(int j = 0; j<grid[i].length; j++){
                if(grid[i][j] == 1){
                    islands++;
                    if(i<grid.length-1 && grid[i+1][j] == 1){
                        neighbour++;
                    }
                    if(j<grid[i].length-1 && grid[i][j+1] == 1){
                        neighbour++;
                    }
                }
            }
        }
        return (islands*4)-(neighbour*2);
    }

}
