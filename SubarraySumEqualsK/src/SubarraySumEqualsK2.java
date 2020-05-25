import java.util.HashMap;
import java.util.Map;

public class SubarraySumEqualsK2 {
    public static void main(String[] args) {
        System.out.println(subarraySum(new int[]{1,1,1}, 2));
    }

    private static int subarraySum(int[] nums, int k) {
        int count = 0, sum = 0;
        Map<Integer, Integer> map = new HashMap<>(); // map of running sum and their occurances
        map.put(0, 1);

        for(int i: nums){
            sum += i;

            if(map.containsKey(sum - k)) count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
