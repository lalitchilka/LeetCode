import java.util.Stack;

public class OnlineStockSpan {
    public static void main(String[] args) {
        StockSpanner S = new StockSpanner();
        System.out.println(S.next(100));
        System.out.println(S.next(80));
        System.out.println(S.next(60));
        System.out.println(S.next(70));
        System.out.println(S.next(60));
        System.out.println(S.next(75));
        System.out.println(S.next(85));
    }

    static class StockSpanner{
        Stack<int[]> s;
        public StockSpanner(){
            s = new Stack<>();
        };
        public int next(int price) {
            int count = 1;
            while(!s.isEmpty() && s.peek()[0] <= price){
                count += s.pop()[1];
            }
            s.push(new int[]{price, count});
            return count;
        }
    }
}
