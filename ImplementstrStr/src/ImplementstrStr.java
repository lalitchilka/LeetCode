
public class ImplementstrStr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(strStr("hello", "ll"));
	}

	private static int strStr(String haystack, String needle) {
	       return haystack.contains(needle)?haystack.indexOf(needle):-1;
	    }

}
