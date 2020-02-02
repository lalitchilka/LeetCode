import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 3;
		System.out.println(generateParenthesis(n));
	}
	
	private static List<String> li = new ArrayList<String>();
	
	private static List<String> generateParenthesis(int n) {
		return helper("", n, 0, 0);
	}
	private static List<String> helper(String s, int n, int leftParen, int rightParen) {
		// TODO Auto-generated method stub
		
		if(leftParen == n && rightParen == n) {
			li.add(s);
			return li;
		}
		
		if(leftParen < n) {
			helper(s + "(", n, leftParen + 1, rightParen);
		}
		
		if(rightParen < leftParen) {
			helper(s + ")", n, leftParen, rightParen + 1);
		}
		
		return li;
	}

}
