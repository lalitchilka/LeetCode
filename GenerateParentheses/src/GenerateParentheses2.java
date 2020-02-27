import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses2 {
	
	private static List<String> l = new ArrayList<String>();
	public static void main(String[] args) {
		int n = 3;
		System.out.println(generateParentheses(n));
	}

	private static List<String> generateParentheses(int n) {
		// TODO Auto-generated method stub
		return helper(n, 0, 0, "");
	}

	private static List<String> helper(int n, int open, int close, String s) {
		// TODO Auto-generated method stub
		if(open == n && close == n) {
			l.add(s);
			return l;
		}
		
		if(open < n && close <= open) {
			helper(n, open + 1, close, s + "(");
		}
		
		if(close < open) {
			helper(n, open, close + 1, s + ")");
		}
		return l;
	}
}
