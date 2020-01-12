public class HappyNumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(3));
	}

	private static boolean isHappy(int n) {
		int slow = n, fast = n;
		while(true) {
			slow = dosum(slow);
			fast = dosum(fast);
			fast = dosum(fast);
			if(slow == fast) {
				break;
			}
		}
		return slow == 1;
	}
	
	private static int dosum(int n) {
		int sum = 0;
		while (n > 0) {
			sum += (n % 10) * (n % 10);
			n = n / 10;
		}
		return sum;
	}

}
