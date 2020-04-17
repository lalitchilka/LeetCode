import java.util.Stack;

public class ValidParenthesisString {
    public static void main(String[] args) {
        System.out.println(checkValidString("(*))"));
    }

    private static boolean checkValidString(String s) {
        if(s.length() == 0) return true;
        int balance = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == ')') balance--;
            else balance++;

            if(balance < 0) return false;
        }

        if(balance == 0) return true;

        balance = 0;

        for(int i = s.length() - 1; i >= 0; i--){
            if(s.charAt(i) == '(') balance--;
            else balance++;

            if(balance < 0) return false;
        }
        return true;
    }
}
