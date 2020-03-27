import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofBinaryTree2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode root = new TreeNode(3);
		TreeNode r1 = new TreeNode(9);
		TreeNode r2 = new TreeNode(20);
		TreeNode r3 = new TreeNode(15);
		TreeNode r4 = new TreeNode(7);
		root.left = r1;
		root.right = r2;
		r2.left = r3;
		r2.right = r4;
		System.out.println(maxDepth(root));
	}
	
	private static int maxDepth(TreeNode root) {
		if(root == null) return 0;
		int left = maxDepth(root.left);
		int right = maxDepth(root.right);
		return Math.max(left, right) + 1;
	}

}
