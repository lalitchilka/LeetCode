public class BitwiseANDofNumbersRange {
    public static void main(String[] args) {
        System.out.println(rangeBitwiseAnd(8, 12));
    }

    private static int rangeBitwiseAnd(int m, int n) {
        int count = 0;

        while(m != n){
            m = m >> 1;
            n = n >> 1;
            count++;
        }
        return m << count;
    }
}
