
public class AddStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num1 = "806";
		String num2 = "215";
		
		System.out.println(addStrings(num1, num2));
	}
	
	private static String addStrings(String num1, String num2) {
		int pt1 = num1.length()-1;
		int pt2 = num2.length()-1;
		int carry = 0;
		StringBuilder sb = new StringBuilder();
		
		while(pt1 >=0 || pt2 >=0) {
			int sum = 0;
			if(pt1 >= 0) {
				sum += num1.charAt(pt1--)-'0';
			}
			if(pt2 >= 0) {
				sum += num2.charAt(pt2--)-'0';
			}
			sum += carry;
			carry = sum/10;
			sb.append(sum % 10);
		}
		
		while(carry > 0) {
			sb.append(carry % 10);
			carry /= 10;
		}
		
		return sb.reverse().toString();
	}

}
