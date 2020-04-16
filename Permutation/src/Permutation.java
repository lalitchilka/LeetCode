import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static void main(String[] args) {
        System.out.println(permutation(new int[]{1,2,3}));
    }
    private static List<List<Integer>> result = new ArrayList<>();
    private static List<List<Integer>> permutation(int[] nums){
        helper(new ArrayList<Integer>(), nums);
        return result;
    }

    private static void helper(List<Integer> l, int[] nums){
        if(l.size() == nums.length) result.add(new ArrayList(l));

        for(int i = 0; i < nums.length; i++){
            if(l.contains(nums[i])) continue;
            l.add(nums[i]);
            helper(l, nums);
            l.remove(l.size() - 1);
        }
    }
}
