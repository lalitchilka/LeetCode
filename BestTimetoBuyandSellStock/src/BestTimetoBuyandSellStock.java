
public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] prices = new int[] {7,1,5,3,6,4};
		System.out.println(maxProfit(prices));
	}
	
	private static int maxProfit(int[] prices) {
		int minValue = Integer.MAX_VALUE;
		int profit = 0;
		
		for(int i = 0; i < prices.length; i++) {
			if(prices[i] < minValue) minValue = prices[i];
			else if(profit < prices[i] - minValue) profit = prices[i] - minValue;
		}
		return profit;
	}

}
