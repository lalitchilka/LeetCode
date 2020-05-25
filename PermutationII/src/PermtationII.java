import java.util.ArrayList;
import java.util.List;

public class PermtationII {
    public static void main(String[] args) {
        System.out.println(permutation(new int[] {1,1,2}));
    }

    private static List<List<Integer>> result = new ArrayList<>();

    private static List<List<Integer>> permutation(int[] nums){
        helper(nums, new ArrayList<>(), new boolean[nums.length]);
        return result;
    }

    private static void helper(int[] nums, List<Integer> l, boolean[] used){
        if(l.size() == nums.length){
            result.add(new ArrayList<>(l));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if(used[i]) continue;
            l.add(nums[i]);
            used[i] = true;
            helper(nums, l, used);
            l.remove(l.size() - 1);
            used[i] = false;
            while(i + 1 < nums.length && nums[i] == nums[i + 1]) ++i;
        }
    }
}
