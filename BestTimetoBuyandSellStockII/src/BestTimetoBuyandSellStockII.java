
public class BestTimetoBuyandSellStockII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = new int[] {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
	
	private static int maxProfit(int[] prices) {
		int profit = 0;
		for(int i = 1; i < prices.length; i++) {
			if(prices[i] > prices[i - 1]) profit += prices[i] - prices[i - 1];
		}
		return profit;
	}

}
