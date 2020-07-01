public class ArrangingCoins {
    public static void main(String[] args) {
        System.out.println(arrangeCoins(10));
    }

    private static int arrangeCoins(int n) {
        long start = 1, end = n, mid = 0, sum = 0;

        while(start <= end){
            mid = start + (end - start) / 2;
            sum = mid * (mid + 1) / 2;

            if(sum == n) return (int) mid;

            if(sum > n) end = mid - 1;
            else start = mid + 1;
        }
        return (int) end;
    }
}
