public class NumberComplement1 {
    public static void main(String[] args) {
        System.out.println();
    }

    private static int findComplement(int num) {
        int binaryBitLength = (int) (Math.log(num)/Math.log(2)) + 1;
        int maxNumber = (1 << binaryBitLength) - 1;
        return num ^ maxNumber;
    }
}
