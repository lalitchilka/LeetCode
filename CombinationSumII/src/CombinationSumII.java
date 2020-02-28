import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candidates = new int[] {10,1,2,7,6,1,5};
		int target = 8;
		System.out.println(combinationSum(candidates, target));
	}

	private static List<List<Integer>> combinationSum(int[] candidates, int target) {
		// TODO Auto-generated method stub
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		if(candidates == null || candidates.length == 0) return result;
		List<Integer> combinations = new ArrayList<Integer>();
		Arrays.sort(candidates);
		helper(result, combinations, candidates, target, 0);
		return result;
	}

	private static void helper(List<List<Integer>> result, List<Integer> combinations, int[] candidates, int target,
			int start) {
		// TODO Auto-generated method stub
		if(target == 0 && !result.contains(combinations)) {
			result.add(new ArrayList<Integer>(combinations));
			return;
		}
		
		for(int i = start; i < candidates.length; i++) {
			if(candidates[i] > target) break;
			combinations.add(candidates[i]);
			helper(result, combinations, candidates, target - candidates[i], i + 1);
			combinations.remove(combinations.size() - 1);
		}
	}

}
