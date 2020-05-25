public class MaximumSumCircularSubarray {
    public static void main(String[] args) {
        System.out.println(maxSubarraySumCircular(new int[]{1,-2,3,-2}));
    }

    private static int maxSubarraySumCircular(int[] A) {
        int totalSum = 0;
        int currMaxSum = 0;
        int currMinSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for(int i: A){
            totalSum += i;

            currMaxSum = Math.max(currMaxSum + i, i);
            maxSum = Math.max(maxSum, currMaxSum);

            currMinSum = Math.min(currMinSum + i, i);
            minSum = Math.min(currMinSum, minSum);
        }

        if(maxSum > 0) return Math.max(maxSum, totalSum - minSum);
        return maxSum;
    }
}
