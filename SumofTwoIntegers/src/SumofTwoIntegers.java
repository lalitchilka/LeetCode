
public class SumofTwoIntegers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getSum(2, 3));
	}
	
	private static int getSum(int a, int b) {
        while(b != 0) {
        	int carry = a & b;
        	a ^= b;
        	b = carry << 1;
        }
        return a;
    }

}
