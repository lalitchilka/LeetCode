
public class SumofLeftLeaves {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(9);
		TreeNode t3 = new TreeNode(20);
		TreeNode t4 = new TreeNode(15);
		TreeNode t5 = new TreeNode(7);
		
		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t3.right = t5;
		System.out.println(sumOfLeftLeaves(t1));
	}
	
	private static int sum = 0;
	private static int sumOfLeftLeaves(TreeNode root) {
		if(root == null) return sum;
		if(root.left != null && (root.left.left == null && root.left.right == null)) sum += root.left.val;
		else sumOfLeftLeaves(root.left);
		if(root.right != null) sumOfLeftLeaves(root.right);
		return sum;
	}

}
