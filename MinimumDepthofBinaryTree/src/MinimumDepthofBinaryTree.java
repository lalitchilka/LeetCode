import java.util.LinkedList;
import java.util.Queue;

public class MinimumDepthofBinaryTree {

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
		
		System.out.println(minDepth(t1));
	}
	
	private static int minDepth(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		int level = 1;
		while(q.size() != 0) {
			int size = q.size();
			for(int i = 0; i < size; i++) {
				TreeNode temp = q.poll();
				if(temp.left == null && temp.right == null) return level;
				if(temp.left != null) q.offer(temp.left);
				if(temp.right != null) q.offer(temp.right);
			}
			level++;
		}
		return level;
    }

}
