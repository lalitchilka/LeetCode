import java.util.ArrayList;
import java.util.List;

public class Permutation2 {
    public static void main(String[] args) {
        System.out.println(permutation(new int[]{1,2,3}));
    }

    private static List<List<Integer>> result = new ArrayList<>();

    private static List<List<Integer>> permutation (int[] nums){
        helper(nums, new ArrayList<Integer>());
        return result;
    }

    private static void helper(int[] nums, List<Integer> l){
        if(l.size() == nums.length){
            result.add(new ArrayList<>(l));
            return;
        }

        for(int i = 0; i < nums.length; i++){
            if(l.contains(nums[i])) continue;
            l.add(nums[i]);
            helper(nums, l);
            l.remove(l.size() - 1);
        }
    }
}
