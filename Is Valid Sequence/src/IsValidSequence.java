public class IsValidSequence {
    public static void main(String[] args) {
        TreeNode r1 = new TreeNode(0);
        TreeNode r2 = new TreeNode(1);
        TreeNode r3 = new TreeNode(0);
        TreeNode r4 = new TreeNode(0);
        TreeNode r5 = new TreeNode(1);
        TreeNode r6 = new TreeNode(1);
        TreeNode r7 = new TreeNode(0);
        TreeNode r8 = new TreeNode(0);
        TreeNode r9 = new TreeNode(0);

        r1.left = r2;
        r1.right = r3;
        r2.left = r4;
        r2.right = r5;
        r4.right = r6;
        r5.left = r7;
        r5.right = r8;
        r3.right = r9;

        int[] arr = new int[]{0,1,0,1};
        System.out.println(isValidSequence(r1, arr));
    }

    private static boolean isValidSequence(TreeNode root, int[] arr){
        if(root == null){
            if(arr.length == 0) return true;
            return false;
        }
        return(helper(root, arr, 0));
    }

    private static boolean helper(TreeNode root, int[] arr, int pos){
        if(root.val != arr[pos]) return false;
        if(pos == arr.length - 1) return (root.left == null && root.right == null);

        return ( (root.left != null && helper(root.left, arr, pos + 1)) ||
                (root.right != null && helper(root.right, arr, pos + 1)) );
    }
}
