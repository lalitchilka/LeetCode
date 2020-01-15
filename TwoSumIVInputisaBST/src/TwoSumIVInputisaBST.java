import java.util.HashSet;

public class TwoSumIVInputisaBST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(5);
		TreeNode t2 = new TreeNode(3);
		TreeNode t3 = new TreeNode(6);
		TreeNode t4 = new TreeNode(2);
		TreeNode t5 = new TreeNode(4);
		TreeNode t6 = new TreeNode(7);
		
		t1.left = t2;
		t1.right = t3;
		t2.left = t4;
		t2.right = t5;
		t3.right = t6;
		
		System.out.println(findTarget(t1, 9));
	}
	
	private static boolean findTarget(TreeNode root, int k) {
		HashSet<Integer> hs = new HashSet<>();
		return helper(root, k, hs);
	}

	private static boolean helper(TreeNode root, int k, HashSet<Integer> hs) {
		// TODO Auto-generated method stub
		if(root == null) return false;
		if(hs.contains(k-root.val)) return true;
		hs.add(root.val);
		return helper(root.left, k, hs) || helper(root.right, k, hs);
	}

}
