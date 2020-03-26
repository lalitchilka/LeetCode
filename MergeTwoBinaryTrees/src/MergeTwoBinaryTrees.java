
public class MergeTwoBinaryTrees {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode r11 = new TreeNode(1);
		TreeNode r12 = new TreeNode(3);
		TreeNode r13 = new TreeNode(2);
		TreeNode r14 = new TreeNode(5);
		TreeNode r21 = new TreeNode(2);
		TreeNode r22 = new TreeNode(1);
		TreeNode r23 = new TreeNode(3);
		TreeNode r24 = new TreeNode(4);
		TreeNode r25 = new TreeNode(7);
		r11.left = r12;
		r11.right = r13;
		r12.left = r14;
		r21.left = r22;
		r21.right = r23;
		r22.right = r24;
		r23.right = r25;
		TreeNode t = mergeTrees(r11, r12);
	}
	
	private static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
		if(t1 == null) return t2;
		if(t2 == null) return t1;
		
		t1.val += t2.val;
		t1.left = mergeTrees(t1.left, t2.left);
		t2.right = mergeTrees(t1.right, t2.right);
		return t1;
	}

}
