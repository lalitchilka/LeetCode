public class FirstUniqueCharacterinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqChar("loveleetcode"));
	}
	
	private static int firstUniqChar(String s) {
		int[] arr = new int [26];
		char[] l = s.toCharArray();
		for(Character c: s.toCharArray()) {
			arr[c - 'a']++;
		}
		for(int i = 0; i < l.length; i++) {
			if(arr[s.charAt(i) - 'a'] == 1) return i;
		}
		return -1;
	}

}
