import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum {

	public static void main(String[] args) {
		int[] candidates = new int[] {2,3,6,7};
		int target = 7;
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
		if(target == 0) {
			result.add(new ArrayList<Integer>(combinations));
			return;
		}
		
		for(int i = start; i < candidates.length; i++) {
			if(candidates[i] > target) break;
			combinations.add(candidates[i]);
			helper(result, combinations, candidates, target - candidates[i], i);
			combinations.remove(combinations.size() - 1);
		}
	}

}
