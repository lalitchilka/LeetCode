import java.util.Stack;

public class RemoveKDigits {
    public static void main(String[] args) {
        System.out.println(removeKdigits("1234567890", 9));
    }

    private static String removeKdigits(String num, int k) {
        if(num.length() == k || num.length() == 0) return "0";

        Stack<Character> s = new Stack<>();
        for(int i = 0; i < num.length(); i++){
            char currChar = num.charAt(i);
            while(k > 0 && !s.isEmpty() && s.peek() > currChar){
                s.pop();
                k--;
            }
            s.push(currChar);
        }

        while(k > 0){
            s.pop();
            k--;
        }

        StringBuilder sb = new StringBuilder();
        while(!s.isEmpty()){
            sb.append(s.pop());
        }

        int len = sb.length() - 1;
        while(sb.length() > 1 && sb.charAt(len) == '0'){
            sb.deleteCharAt(len--);
        }
        return sb.reverse().toString();
    }
}
