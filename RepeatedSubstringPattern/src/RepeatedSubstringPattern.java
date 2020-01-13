
public class RepeatedSubstringPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(repeatedSubstringPattern("aaaaa"));
	}
	
	private static boolean repeatedSubstringPattern(String s) {
        int len = s.length();
        
        for(int i = len/2; i>=1; i--) {
        	if(len%i==0) {
        		int m = len/i;
        		StringBuilder sb = new StringBuilder();
        		String subString = s.substring(0, i);
        		for(int j = 0; j<m; j++) {
        			sb.append(subString);
        		}
        		if(s.equals(sb.toString())) return true;
        	}
        }
        return false;
    }

}
