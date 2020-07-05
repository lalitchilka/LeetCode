public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(1,4));
    }

    private static int hammingDistance(int x, int y) {
        int num = x ^ y;
        int count = 0;
        while(num != 0){
            count += num & 1;
            num = num >> 1;
        }
        return count;
    }
}
