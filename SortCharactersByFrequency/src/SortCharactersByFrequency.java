import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
        System.out.println(frequencySort("Aabb"));
    }

    private static String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        PriorityQueue<Map.Entry<Character, Integer>> pq = new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(map.entrySet());

        StringBuilder sb = new StringBuilder();
        while(!pq.isEmpty()){
            Map.Entry<Character, Integer> en = pq.poll();
            Character c = en.getKey();
            Integer in = en.getValue();
            for(int i = 0; i < in; i++) sb.append(c);
        }
        return sb.toString();
    }
}
