
public class ExcelSheetColumnTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 701;
		System.out.println(convertToTitle(n));
	}
	
	private static String convertToTitle(int n) {
		StringBuilder sb = new StringBuilder();
		
		while(n > 0) {
			n--;
			sb.append((char)('A'+(n%26)));
			n /= 26;
		}
		return sb.reverse().toString();   
    }

}
