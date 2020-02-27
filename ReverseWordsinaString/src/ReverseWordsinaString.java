import java.util.Arrays;
import java.util.Collections;

public class ReverseWordsinaString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverseWords("the sky is blue"));
	}

	private static String reverseWords(String s) {
		// TODO Auto-generated method stub
		String[] words = s.trim().split("\\s+");
		Collections.reverse(Arrays.asList(words));
		return String.join(" ", words);
	}
	
	

}
