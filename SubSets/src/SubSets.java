import java.util.ArrayList;
import java.util.List;

public class SubSets {
    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1,2,3}));
    }

    private static List<List<Integer>> result = new ArrayList<>();

    private static List<List<Integer>> subsets(int[] nums) {
        helper(nums, new ArrayList<Integer>(), 0);
        return result;
    }

    private static void helper(int[] nums, List<Integer> l, int start){
        result.add(new ArrayList<>(l));
        for(int i = start; i < nums.length; i++){
            l.add(nums[i]);
            helper(nums, l, i + 1);
            l.remove(l.size() - 1);
        }
    }
}
