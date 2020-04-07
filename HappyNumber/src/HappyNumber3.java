import java.util.HashSet;
import java.util.Set;

public class HappyNumber3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isHappy(17));
	}
	
	private static boolean isHappy(int n) {
		int number = n;
		int reminder = 0, squaredNumber = 0;
		Set<Integer> set = new HashSet<>();
		
		while(number != 1) {
			while(number > 0) {
				reminder = number % 10;
				squaredNumber += reminder * reminder;
				number = number / 10;
			}
			if(set.contains(squaredNumber)) return false;
			set.add(squaredNumber);
			number = squaredNumber;
			squaredNumber = 0;
		}
		return true;
	}

}
