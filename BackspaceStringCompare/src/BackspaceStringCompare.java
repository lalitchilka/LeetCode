import java.util.Stack;

public class BackspaceStringCompare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(backspaceCompare("y#fo##f", "y#f#o##f"));
	}
	
	private static boolean backspaceCompare(String S, String T) {
		Stack<Character> s1 = new Stack<>();
		Stack<Character> s2 = new Stack<>();
		
		for(int i = 0; i < S.length(); i++) {
			if(!s1.isEmpty() && S.charAt(i) == '#') s1.pop();
			else {
				if(S.charAt(i) != '#') s1.push(S.charAt(i));
			}
		}
		
		for(int i = 0; i < T.length(); i++) {
			if(!s2.isEmpty() && T.charAt(i) == '#') s2.pop();
			else {
				if(T.charAt(i) != '#') s2.push(T.charAt(i));
			}
		}
		return s1.equals(s2);
	}

}
