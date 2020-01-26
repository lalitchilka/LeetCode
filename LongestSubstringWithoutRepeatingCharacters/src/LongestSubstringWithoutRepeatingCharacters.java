import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("dvdf"));
	}
	
	private static int lengthOfLongestSubstring(String s) {
        int aPointer = 0, bPointer = 0, max = 0;
        Set<Character> hs = new HashSet<>();

        while(bPointer < s.length()) {
        	if(!hs.contains(s.charAt(bPointer))) {
        		hs.add(s.charAt(bPointer++));
        		max = Math.max(max, hs.size());
        	}else {
        		hs.remove(s.charAt(aPointer++));
        	}
        }
        return max;
	}

}
