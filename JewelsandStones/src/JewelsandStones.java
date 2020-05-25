import java.util.HashSet;
import java.util.Set;

public class JewelsandStones {
    public static void main(String[] args) {
        System.out.println(numJewelsInStones("aA", "aAAbbbb"));
    }

    private static int numJewelsInStones(String J, String S) {
        int result = 0;
        Set s = new HashSet();
        for(char c: J.toCharArray()) s.add(c);
        for(char c: S.toCharArray()){
            if(s.contains(c)) result++;
        }
        return result;
    }
}
