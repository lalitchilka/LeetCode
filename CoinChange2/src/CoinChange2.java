
public class CoinChange2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = new int[] {1, 2, 5};
		System.out.println(change(5, coins));
	}
	
	private static int change(int amount, int[] coins) {
		int[][] dp = new int[coins.length + 1][amount + 1];
		
		dp[0][0] = 1;
		for(int i = 1; i <= coins.length; i++) {
			dp[i][0] = 1;
			for(int j = 1; j < dp[0]. length; j++) {
				dp[i][j] = (j >= coins[i - 1] ? dp[i][j - coins[i - 1]] : 0) + dp[i - 1][j];
			}
		}
		return dp[dp.length - 1][dp[0].length - 1];
	}

}
