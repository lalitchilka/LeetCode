public class NumberofIslands2 {
    public static void main(String[] args) {
        System.out.println(numIslands(new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','0','0'}
        }));
    }
    private static int numIslands(char[][] grid) {
        int count = 0;
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++){
                if(grid[i][j] == '1'){
                    count++;
                    turnOneToZero(grid, i, j);
                }
            }
        }
        return count;
    }

    private static void turnOneToZero(char[][] grid, int i, int j){
        if(i < 0 || i >= grid.length || j < 0 || j >= grid[0].length || grid[i][j] == '0') return;

        grid[i][j] = '0';

        turnOneToZero(grid, i - 1, j);
        turnOneToZero(grid, i + 1, j);
        turnOneToZero(grid, i, j - 1);
        turnOneToZero(grid, i, j + 1);
    }
}
