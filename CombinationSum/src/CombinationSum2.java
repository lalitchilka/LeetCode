import java.util.ArrayList;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        System.out.println(combinationSum(new int[]{2,3,6,7}, 7));
    }

    private static List<List<Integer>> result = new ArrayList<>();
    private static List<List<Integer>> combinationSum(int[] candidates, int target) {
        helper(candidates, target, new ArrayList<Integer>(), 0);
        return result;
    }

    private static void helper(int[] candidates, int target, List<Integer> l, int start){
        if(target < 0) return;
        else if(target == 0) result.add(new ArrayList<>(l));
        else{
            for(int i = start; i < candidates.length; i++){
                if(target < candidates[i]) break;
                l.add(candidates[i]);
                helper(candidates, target - candidates[i], l, i);
                l.remove(l.size() - 1);
            }
        }
    }
}
