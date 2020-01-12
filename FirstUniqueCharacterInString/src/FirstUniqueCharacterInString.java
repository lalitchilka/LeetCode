
public class FirstUniqueCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("loveleetcode"));
	}
	
	private static int firstUniqChar(String s) {
		int[] arr = new int[26];
		
		for(int i = 0; i<s.length(); i++) {
			arr[s.charAt(i)-'a']++;
		}
		
		for(int i = 0; i<s.length(); i++) {
			if(arr[s.charAt(i)-'a'] == 1) return i;
		}
		return -1;
	}

}
