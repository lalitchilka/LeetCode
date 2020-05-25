public class ConstructBinarySearchTreefromPreorderTraversal2 {
    public static void main(String[] args) {
        TreeNode result = bstFromPreorder(new int[] {8,5,1,7,10,12});
    }

    private static TreeNode bstFromPreorder(int[] preorder) {
        if(preorder.length == 0) return null;
        if(preorder.length == 1) return new TreeNode(preorder[0]);
        return construct(preorder, 0, preorder.length - 1);
    }

    private static TreeNode construct(int[] preorder, int start, int end) {
        if(start > end) return null;
        TreeNode root = new TreeNode(preorder[start]);
        if(start == end) return root;

        int index = start + 1;
        while(index <= end && preorder[index] < preorder[start]) index++;

        root.left = construct(preorder, start + 1, index - 1);
        root.right = construct(preorder, index, end);
        return root;
    }
}
