import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(strs));
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
		for(String s: strs) {
			char[] c = s.toCharArray();
			Arrays.sort(c);
			if(!map.containsKey(String.valueOf(c))) map.put(String.valueOf(c), new ArrayList<>());
			map.get(String.valueOf(c)).add(s);
		}
		return new ArrayList<>(map.values());
	}

}
