import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CoinChangeHackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Long> c = new ArrayList<>();
		c.add((long) 2); c.add((long) 5); c.add((long) 3); c.add((long) 6);
		System.out.println(getWays(10, c));
	}
	
	private static long getWays(int n, List<Long> c) {
		long[] arr = new long[n + 1];
        Arrays.fill(arr, n + 1);
        Collections.sort(c);
        arr[0] = 0;
        int ways = 0;

        for(int i = 1; i < arr.length; i++){
            for(long coin: c){
                if(coin <= (long) i){
                    arr[i] = Math.min(arr[i - (int) coin] + 1, arr[i]);
                    if((arr[i] != n + 1) && (i == n)) {
                    	ways++;
                    }
                }else break;
            }
//            if(arr[i] < n + 1) ways++;
        }
        return ways;
	}

}
