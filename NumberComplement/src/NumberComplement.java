public class NumberComplement {
    public static void main(String[] args) {
        System.out.println(findComplement(5));
    }

    private static int findComplement(int num) {
        int i = 0, j = 0;
        while(i < num){
            i += Math.pow(2, j);
            j++;
        }
        return i - num;
    }
}
