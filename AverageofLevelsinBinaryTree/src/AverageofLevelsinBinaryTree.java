import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


public class AverageofLevelsinBinaryTree {

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
		
		System.out.println(averageOfLevels(t1));
	}
	
	private static List<Double> averageOfLevels(TreeNode root) {
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		List<Double> l = new ArrayList<Double>();
		q.add(root);
		
		while(q.size() != 0) {
			int size = q.size();
			double sum = 0;
			
			for(int i = 0; i < size; i++) {
				TreeNode temp = q.poll();
				if(temp.left != null) q.add(temp.left);
				if(temp.right != null) q.add(temp.right);
				sum += temp.val;
			}
			l.add(sum / size);
		}
		return l;
	}

}
