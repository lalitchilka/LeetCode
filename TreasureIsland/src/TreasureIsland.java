import java.util.LinkedList;
import java.util.Queue;

public class TreasureIsland {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] island = new int[][] {
			{'O', 'O', 'O', 'O'},
			{'D', 'O', 'D', 'O'},
			{'O', 'O', 'O', 'O'},
			{'X', 'D', 'D', 'O'}
		};
		
		System.out.println(isTreasureIsland(island));
	}
	
	private static int isTreasureIsland(int[][] island) {
		
		int steps = 0;
		boolean[][] visitedIsland = new boolean[island.length][island[0].length];
		Queue<Coordinates> q = new LinkedList<>();
		int[][] moves = new int[][] {{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
		q.offer(new Coordinates(0 , 0));
		visitedIsland[0][0] = true;
		
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				Coordinates coordinates = q.poll();
				int x = coordinates.x;
				int y = coordinates.y;
				
				if(island[x][y] == 'X') return steps;
				
				for(int[] move: moves) {
					int newX = x + move[0];
					int newY = y + move[1];
					
					if(newX >= 0 && newX < island.length && newY >= 0 && newY < island[0].length 
							&& !visitedIsland[newX][newY] && island[newX][newY] != 'D') {
						q.add(new Coordinates(newX, newY));
						visitedIsland[newX][newY] = true;
					}
				}
			}
			steps++;
		}
		return 0;
	}
}

class Coordinates{
	int x;
	int y;
	public Coordinates(int x, int y) {
		this.x = x;
		this.y = y;
	}
}
