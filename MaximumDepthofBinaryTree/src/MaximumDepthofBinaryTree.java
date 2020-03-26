import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthofBinaryTree {

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
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		int level = 0;
		
		while(!q.isEmpty()) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				TreeNode node = q.poll();
				if(node.left != null) q.offer(node.left);
				if(node.right != null) q.offer(node.right);
			}
			level++;
		}
		return level;
	}

}
