public class ConstructBinarySearchTreefromPreorderTraversal {
    public static void main(String[] args) {
        TreeNode result = bstFromPreorder(new int[] {8,5,1,7,10,12});

    }

    private static TreeNode bstFromPreorder(int[] preorder) {
        return helper(preorder, 0, preorder.length - 1);
    }

    private static TreeNode helper(int[] preorder, int start, int end){
        if(start > end) return null;

        TreeNode root = new TreeNode(preorder[start]);
        if(start == end) return root;

        int index = start + 1;
        while(index <= end && preorder[index] < preorder[start]) index++;

        root.left = helper(preorder, start + 1, index - 1);
        root.right = helper(preorder, index, end);
        return root;
    }
}
