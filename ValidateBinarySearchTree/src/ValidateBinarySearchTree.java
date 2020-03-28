import java.util.Stack;

public class ValidateBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(5);
		TreeNode t2 = new TreeNode(1);
		TreeNode t3 = new TreeNode(4);
		TreeNode t4 = new TreeNode(3);
		TreeNode t5 = new TreeNode(6);
		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t3.right = t5;
		System.out.println(isValidBST(t1));
	}
	
	private static boolean isValidBST(TreeNode root) {
		Stack<TreeNode> s = new Stack<>();
		double leftval = Double.MAX_VALUE;
		while(!s.isEmpty() || root != null) {
			while(root != null) {
				s.push(root);
				root = root.left;
			}
			root = s.pop();
			if(root.val <= leftval) return false;
			leftval = root.val;
			root = root.right;
		}
		return true;
	}

}
