import java.util.HashMap;
import java.util.Map;

public class WordPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(wordPattern("abba", "dog cat cat fish"));
	}
	
	private static boolean wordPattern(String pattern, String str) {
		Map<String, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        String[] arr = str.split(" ");
        if(arr.length != pattern.length()) return false;
        for(int i = 0; i<arr.length; i++){
            if(!map.containsKey(arr[i]) && !map.containsValue(pattern.charAt(i))) map.put(arr[i], pattern.charAt(i));
        }
        for(int i = 0; i < pattern.length(); i++){
            sb.append(map.get(arr[i]));
        }
        return sb.toString().equals(pattern);
    }

}
