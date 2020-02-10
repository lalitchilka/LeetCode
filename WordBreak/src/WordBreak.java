import java.util.ArrayList;
import java.util.List;

public class WordBreak {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = new ArrayList<>();
		l.add("leet");
		l.add("code");
		String s = "leetcode";
		System.out.println(wordBreak(s, l));
	}
	
	private static boolean wordBreak(String s, List<String> wordDict) {
		boolean[] wb = new boolean[s.length() + 1];
		wb[0] = true;
		
		for(int i = 1; i <= s.length(); i++) {
			for(int j = 0; j < i; j++) {
				if(wb[j] && wordDict.contains(s.substring(j, i))) {
					wb[i] = true;
					break;
				}
			}
		}
		return wb[s.length()];
	}

}
