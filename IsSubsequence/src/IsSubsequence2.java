public class IsSubsequence2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubsequence("abc", "ahbgdc"));
	}
	
	private static boolean isSubsequence(String s, String t) {
		if(s.length() == 0) return true;
		int prev = 0;
		for(int i = 0; i < s.length(); i++) {
			prev = t.indexOf(s.charAt(i), prev);
			if(prev == -1) return false;
			prev++;
		}
		return true;
    }

}
