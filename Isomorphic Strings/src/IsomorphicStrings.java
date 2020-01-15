import java.util.HashMap;

public class IsomorphicStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(isIsomorphic("egg", "add"));
	}
	
	private static boolean isIsomorphic(String s, String t) {
		HashMap<Character, Character> map = new HashMap<Character, Character>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++) {
			if(!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))) map.put(s.charAt(i), t.charAt(i));
		}
		
		for(int i = 0; i < s.length(); i++) {
			sb.append(map.get(s.charAt(i)));
		}
		
		return t.equals(sb.toString());
	}

}
