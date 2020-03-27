import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLevelOrderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(3);
		TreeNode t2 = new TreeNode(9);
		TreeNode t3 = new TreeNode(20);
		TreeNode t4 = new TreeNode(15);
		TreeNode t5 = new TreeNode(17);
		t1.left = t2;
		t1.right = t3;
		t3.left = t4;
		t3.right = t5;
		System.out.println(levelOrder(t1));
	}
	
	private static  List<List<Integer>> levelOrder(TreeNode root) {
		if(root == null) return new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		List<List<Integer>> result = new ArrayList<>();
		q.offer(root);
		
		while(!q.isEmpty()) {
			int size = q.size();
			List<Integer> l = new ArrayList<>();
			for(int i = 0; i < size ; i++) {
				TreeNode node = q.poll();
				if(node.left != null) q.offer(node.left);
				if(node.right != null) q.offer(node.right);
				l.add(node.val);
			}
			result.add(l);
		}
		return result;
	}

}
