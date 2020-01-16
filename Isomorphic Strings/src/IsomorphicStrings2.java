public class IsomorphicStrings2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsomorphic("foo", "bar"));
	}
	
	private static boolean isIsomorphic(String s, String t) {
		int[] m = new int[256];
		int[] n = new int[256];
		
		for(int i = 0; i < s.length(); i++) {
			m[s.charAt(i)]++;
			n[t.charAt(i)]++;
		}
		
		for(int i = 0; i < s.length(); i++) {
			if(m[s.charAt(i)] != n[t.charAt(i)]) return false;
		}
		return true;
	}

}
