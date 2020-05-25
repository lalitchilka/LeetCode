import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses3 {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(3));
    }

    private static List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        helper(n, result, "", 0, 0);
        return result;
    }

    private static void helper(int n, List<String> result, String s, int open, int close){
        if(s.length() == 2 * n){
            result.add(s);
            return;
        }

        if(open < n) helper(n, result, s + "(", open + 1, close);
        if(close < open) helper(n, result, s + ")", open, close + 1);
    }
}
