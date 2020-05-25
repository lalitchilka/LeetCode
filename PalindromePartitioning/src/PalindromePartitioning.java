import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        System.out.println(partition("aab"));
    }

    private static List<List<String>> result = new ArrayList<>();

    private static List<List<String>> partition(String s) {
        helper(s, new ArrayList<String>(), 0);
        return result;
    }

    private static void helper(String s, List<String> l, int start){
        if(start == s.length()) {
            result.add(new ArrayList<>(l));
            return;
        }
        for(int i = start; i < s.length(); i++){
            if(isPalindrome(s, start, i)){
                l.add(s.substring(start, i + 1));
                helper(s, l, i + 1);
                l.remove(l.size() - 1);
            }
        }
    }

    private static boolean isPalindrome(String s, int start, int end){
        while(start < end){
            if(s.charAt(start++) != s.charAt(end--)) return false;;
        }
        return true;
    }
}
