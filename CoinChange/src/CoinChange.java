import java.util.Arrays;

public class CoinChange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] coins = new int[] { 3 };
		int amount = 2;
		System.out.println(coinChange(coins, amount));
	}

	public static int coinChange(int[] coins, int amount) {
		Arrays.sort(coins);
		int[] arr = new int[amount + 1];
		Arrays.fill(arr, amount + 1);
		arr[0] = 0;

		for (int i = 1; i < arr.length; i++) {
			for (int coin : coins) {
				if(coin <= i){
					arr[i] = Math.min(arr[i - coin] + 1, arr[i]);
				}else break;
			}
		}
		return arr[arr.length - 1] > amount ? -1 : arr[arr.length - 1];
	}

}
