
public class LongestPalindromicSubstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(longestPalindrome("racecar"));
	}
	
	static int maxLen = 0, start = 0;
	private static String longestPalindrome(String s) {
		if(s.length() < 2) return s;
		
		for(int i = 0; i < s.length(); i++) {
			expandFromMiddle(s, i, i); // for odd length
			expandFromMiddle(s, i, i + 1); // for even length.
		}
		
		return s.substring(start, start + maxLen);
	}
	
	private static void expandFromMiddle(String str, int left, int right) {
		while(left >=0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
			left--;
			right++;
		}
		int subStrLen = right - left -1;
		if(maxLen < subStrLen) {
			maxLen = subStrLen;
			start = left + 1;
		}
	}

}
