public class IsSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isSubsequence("abc", "ahbgdc"));
	}
	
	private static boolean isSubsequence(String s, String t) {
		char[] cs = s.toCharArray();
        int index = 0;
        for(int i = 0; i < t.length(); i++){
            if(t.charAt(i) == cs[index]) index++;
        }
        return index == cs.length;
    }

}
