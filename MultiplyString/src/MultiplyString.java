
public class MultiplyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(multiply("123","789"));
	}
	
	private static String multiply(String num1, String num2) {
		int pt1 = num1.length(), pt2 = num2.length();
		StringBuilder sb = new StringBuilder();
		int[] arr = new int[pt1+pt2];
		for(int i = pt1-1; i>=0; i--) {
			for(int j = pt2-1; j>=0; j--) {
				int multiply = (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
				int a1 = i+j, a2 = i+j+1;
				int sum = multiply + arr[a2];
				
				arr[a1] += sum/10;
				arr[a2] = sum%10;
			}
		}
		
		for(int num: arr) {
			if(!(sb.length() == 0 && num == 0)) {
				sb.append(num);
			}
		}
		return sb.length() == 0 ? "0" : sb.toString();
	}

}
