public class DiameterofBinaryTree {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1);
        TreeNode t2 = new TreeNode(2);
        TreeNode t3 = new TreeNode(3);
        TreeNode t4 = new TreeNode(4);
        TreeNode t5 = new TreeNode(5);
        t1.left = t2;
        t1.right = t3;
        t2.left = t4;
        t2.right = t5;

        System.out.println(diameterOfBinaryTree(t1));
    }
    private static int max = 0;
    private static int diameterOfBinaryTree(TreeNode t1) {
        helper(t1);
        return max;
    }

    private static int helper(TreeNode root) {
        if(root == null) return 0;

        int left = helper(root.left);
        int right = helper(root.right);

        max = Math.max(max, left + right);

        return Math.max(left, right) + 1;
    }
}
