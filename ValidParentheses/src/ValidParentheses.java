import java.util.Stack;

public class ValidParentheses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isValid("()[]{}"));
	}
	
	public static boolean isValid(String s) {
		if(s.length() == 0) return true;
		Stack<Character> stack = new Stack<>();
        char[] arr = s.toCharArray();
        stack.push(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			if('(' == (arr[i]) || arr[i]==('[') || arr[i]==('{')) {
				stack.push(arr[i]);
			}else {
				if(!stack.isEmpty() && stack.peek().equals(reverse(arr[i]))) {
					stack.pop();
				}else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	private static Character reverse(Character c) {
		// TODO Auto-generated method stub
		if(c.equals(')')) return '(';
		else if(c.equals(']')) return '[';
		else return '{';
	}

}
