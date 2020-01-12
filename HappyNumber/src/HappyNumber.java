import java.util.HashSet;

public class HappyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(2));
	}

	private static boolean isHappy(int n) {
		HashSet<Integer> seen = new HashSet<>();
		while (n != 1) {
			int sum = 0;
			while (n > 0) {
				sum += (n % 10) * (n % 10);
				n = n / 10;
			}
			if (seen.contains(sum)) {
				return false;
			}
			seen.add(sum);
			n = sum;
		}
		return true;
	}

}
