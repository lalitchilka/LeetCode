import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SubsetsII {
    public static void main(String[] args) {
        System.out.println(subsetsWithDup(new int[]{1,2,2}));
    }

    private static List<List<Integer>> result = new ArrayList<>();
    private static List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        helper(nums, new ArrayList<Integer>(), 0);
        return result;
    }

    private static void helper(int[] nums, List<Integer> l, int start){
        result.add(new ArrayList<Integer>(l));
        for(int i = start; i < nums.length; i++){
            l.add(nums[i]);
            helper(nums, l, i + 1);
            l.remove(l.size() - 1);
            while(i + 1 < nums.length && nums[i] == nums[i + 1]) ++i;
        }
    }
}
