import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] strs = new String[] {"eat","tea","tan","ate","nat","bat"};
		System.out.println(groupAnagrams(strs));
	}
	
	public static List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> map = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(String word : strs){
            char[] temp = word.toCharArray();
            Arrays.sort(temp);
            if(map.get(String.valueOf(temp)) == null) map.put(String.valueOf(temp), new ArrayList<>());
            map.get(String.valueOf(temp)).add(word);
        }
        for(List<String> li: map.values()) result.add(li);
        return result;
	}

}
