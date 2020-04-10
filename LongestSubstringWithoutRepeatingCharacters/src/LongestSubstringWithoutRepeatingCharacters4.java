import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
	
	private static int lengthOfLongestSubstring(String s) {
		int start = 0, end = 0, max = 0;
		Set<Character> set = new HashSet<>();
		while(end < s.length()) {
			if(!set.contains(s.charAt(end))) {
				set.add(s.charAt(end++));
				max = Math.max(max, set.size());
			}else {
				set.remove(s.charAt(start++));
			}
		}
		return max;
	}

}
