import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(lengthOfLongestSubstring("abcabcbb"));
	}
	
	private static int lengthOfLongestSubstring(String s) {
		int i = 0, j = 0, max = 0;
		Set<Character> set = new HashSet<Character>();
		
		while(j < s.length()) {
			if(!set.contains(s.charAt(j))) {
				set.add(s.charAt(j++));
				max = Math.max(max, set.size());
			}else {
				set.remove(s.charAt(i++));
			}
		}
		return max;
	}

}
