public class SubtreeofAnotherTree {

    public static void main(String[] args) {
        TreeNode r3 = new TreeNode(1, null, null);
        TreeNode r4 = new TreeNode(2, null, null);
        TreeNode r1 = new TreeNode(4, r3, r4);
        TreeNode r2 = new TreeNode(5, null, null);
        TreeNode root = new TreeNode(3, r1, r2);

        TreeNode s1 = new TreeNode(1, null, null);
        TreeNode s2 = new TreeNode(2, null, null);
        TreeNode subRoot = new TreeNode(4, s1, s2);

        System.out.println(isSubtree(root, subRoot));
    }

    private static boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null)
            return true;
        if (root != null && subRoot == null)
            return false;
        return isSame(root, subRoot) || isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    private static boolean isSame(TreeNode root, TreeNode subRoot) {
        if (root == null && subRoot == null)
            return true;
        if (root == null || subRoot == null)
            return false;
        return root.val == subRoot.val && isSame(root.left, subRoot.left) && isSame(root.right, subRoot.right);
    }
}