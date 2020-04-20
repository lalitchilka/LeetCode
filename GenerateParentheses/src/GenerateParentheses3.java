import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 1;
		System.out.println(generateParenthesis(n));
	}

	private static List<String> l = new ArrayList<String>();
	
	private static List<String> generateParenthesis(int n) {
		// TODO Auto-generated method stub
		return helper(n, 0, 0, "");
	}
	
	private static List<String> helper(int n, int open, int close, String s) {
		// TODO Auto-generated method stub
		if(open == n) {
			l.add(s);
		}
		
		if(open < n) {
			helper(n, open + 1, close, s + "(");
		}
		
		if(close < open) {
			helper(n, open, close + 1, s + ")");
		}
		return l;
	}
	
	

}
