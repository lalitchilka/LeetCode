
public class PowerOfThree {
	public static void main(String[] args) {
		System.out.println(isPowerOfThree(243));
	}
	
	private static boolean isPowerOfThree(int n) {
		int maxPowerOfThree = (int)Math.pow(3, (int)(Math.log(Integer.MAX_VALUE) / Math.log(3)));
	    return n>0 && maxPowerOfThree%n==0;
	}
}
