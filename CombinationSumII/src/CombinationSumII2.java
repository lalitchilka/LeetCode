import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSumII2 {
    public static void main(String[] args) {
        System.out.println(combinationSum2(new int[] {10,1,2,7,6,1,5}, 8));
    }

    private static List<List<Integer>> result = new ArrayList<>();

    private static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        helper(candidates, target, new ArrayList<Integer>(), 0);
        return result;
    }

    private static void helper(int[] candidates, int target, List<Integer> l, int start){
        if(target == 0 && !result.contains(l)){
            result.add(new ArrayList<>(l));
            return;
        }
        if(target < 0) return;

        for(int i = start; i < candidates.length; i++){
            if(target < candidates[i]) break;
            l.add(candidates[i]);
            helper(candidates, target - candidates[i], l, i + 1);
            l.remove(l.size() - 1);
        }
    }
}
