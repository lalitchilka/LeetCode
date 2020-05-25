public class BinaryTreeMaximumPathSum {
    public static void main(String[] args) {
        TreeNode r1 = new TreeNode(10);
        TreeNode r2 = new TreeNode(9);
        TreeNode r3 = new TreeNode(20);
        TreeNode r4 = new TreeNode(15);
        TreeNode r5 = new TreeNode(7);

        r1.left = r2;
        r1.right = r3;
        r3.left = r4;
        r3.right = r5;

        maxPathSum(r1);
    }

    private static int max = Integer.MIN_VALUE;
    private static int maxPathSum(TreeNode root) {
        helper(root);
        return max;
    }

    private static int helper(TreeNode root){
        if(root == null) return 0;
        int left = Math.max(0, helper(root.left));
        int right = Math.max(0, helper(root.right));
        max = Math.max(max, left + right + root.val);
        return Math.max(left, right) + root.val;
    }
}
