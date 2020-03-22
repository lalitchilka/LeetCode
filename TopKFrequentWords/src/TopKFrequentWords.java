import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] words = new String[] { "i", "love", "leetcode", "i", "love", "coding"};
		System.out.println(topKFrequent(words, 2));
	}

	private static List<String> topKFrequent(String[] words, int k) {
		Map<String, Integer> map = new HashMap<>();
		PriorityQueue<String> q = new PriorityQueue<>(
				(n1, n2) -> map.get(n1).equals(map.get(n2)) ? n2.compareTo(n1) : map.get(n1) - map.get(n2));
		List<String> result = new ArrayList<String>();
		for (String word : words) map.put(word, map.getOrDefault(word, 0) + 1);
		for (String w : map.keySet()) {
			q.offer(w);
			if (q.size() > k)
				q.poll();
		}

		while (!q.isEmpty())
			result.add(q.poll());
		Collections.reverse(result);
		return result;
	}
}
