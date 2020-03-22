import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int k = 2;
		int[] nums = new int[] {4,1,-1,2,-1,2,3};
		System.out.println(topKFrequent(nums, k));
	}
	
	private static List<Integer> topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		PriorityQueue<Integer> q = new PriorityQueue<>((n1, n2) -> map.get(n1) - map.get(n2));
		for (Integer num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		for(Integer key : map.keySet()) {
			q.offer(key);
			if(q.size() > k) q.poll();
		}
		
		List<Integer> result = new ArrayList<>();
		while(!q.isEmpty()) {
			result.add(q.poll());
		}
		Collections.reverse(result);
		return result;
	}

}
