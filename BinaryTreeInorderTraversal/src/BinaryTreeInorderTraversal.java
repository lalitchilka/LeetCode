import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class BinaryTreeInorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		
		t1.right = t2;
		t2.left = t3;
		System.out.println(inorderTraversal(t1));
		

	}
	
	private static List<Integer> inorderTraversal(TreeNode root) {
		Stack<TreeNode> s = new Stack<>();
		List<Integer> l = new ArrayList<Integer>();
		TreeNode cur = root;
		
		while(cur != null || !s.isEmpty()) {
			while(cur != null) {
				s.push(cur);
				cur = cur.left;
			}
			cur = s.pop();
			l.add(cur.val);
			cur = cur.right;
		}
		return l;
	}

}
