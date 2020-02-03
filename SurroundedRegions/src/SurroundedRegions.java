
public class SurroundedRegions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[][] board = new char[][] {{'X','X','X','X'},{'X','O','O','X'},{'X','X','O','X'},{'X','O','X','X'}};
		solve(board);
				
	}
	
	private static void solve(char[][] board) {
		if(board == null || board.length == 0) return;
		
		int height = board.length, width = board[0].length;
		
		for(int i = 0; i < height; i++) {
			if(board[i][0] == 'O') {
				turnOtoStar(board, i, 0);
			}
			if(board[i][width - 1] == 'O') {
				turnOtoStar(board, i, width - 1);
			}
		}
		
		for(int j = 0; j < width; j++) {
			if(board[0][j] == 'O') {
				turnOtoStar(board, 0, j);
			}
			if(board[height - 1][j] == 'O') {
				turnOtoStar(board, height - 1, j);
			}
		}
		
		for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'O') {
                	board[i][j] = 'X';
                }else if(board[i][j] == '*') {
                	board[i][j] = 'O';
                }
            }
        }
		int x = 0;
		x++;
	}
	
	private static void turnOtoStar(char[][] board, int i, int j){
        if(i >= board.length || j >= board[0]. length || i < 0 || j < 0) return;
        
        if(board[i][j] == 'O') {
        	board[i][j] = '*';
        }
        
        if(i > 1 && board[i - 1][j] == 'O') {
        	turnOtoStar(board, i - 1, j);
        }
        if(i < board.length - 2 && board[i + 1][j] == 'O') {
        	turnOtoStar(board, i + 1, j);
        }
        if(j > 1 && board[i][j - 1] == 'O') {
        	turnOtoStar(board, i, j - 1);
        }
        if(j < 1 && board[i][j + 1] == 'O') {
        	turnOtoStar(board, i, j + 1);
        }
    }

}
