
public class ValidAnagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isAnagram("cat", "dog"));
	}
	
	private static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] m = new int[256];
        int[] n = new int[256];
        
        for(int i = 0; i < s.length(); i++){
            m[s.charAt(i)]++;
            n[t.charAt(i)]++;
        }
        for(int i = 0; i < s.length(); i++) {
        	if(m[s.charAt(i)] != n[s.charAt(i)]) return false;
        }
        return true;
    }

}
