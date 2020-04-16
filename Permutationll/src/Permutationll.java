import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutationll {
    public static void main(String[] args) {
        System.out.println(permuation(new int[]{1,1,2}));
    }
    private static List<List<Integer>> result = new ArrayList<>();

    private static List<List<Integer>> permuation(int[] nums){
        Arrays.sort(nums);
        helper(nums, new ArrayList<Integer>(), new boolean[nums.length]);
        return result;
    }

    private static void helper(int[] nums, List<Integer> l, boolean[] used){
        if(l.size() == nums.length) {
            result.add(new ArrayList<>(l));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            used[i] = true;
            l.add(nums[i]);
            helper(nums, l, used);
            l.remove(l.size() - 1);
            used[i] = false;
            while(i + 1 < nums.length && nums[i] == nums[i + 1]) ++i;
        }

    }
}
