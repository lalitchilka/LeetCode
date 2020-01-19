import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


public class BinaryTreeLevelOrderTraversalII {

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
		
		System.out.println(levelOrderBottom(t1));

	}
	
	private static List<List<Integer>> levelOrderBottom(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Stack<List<Integer>> s = new Stack<>();
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        q.offer(root);
        
        while(q.size() != 0){
            int size = q.size();
            List<Integer> l = new ArrayList<>();
            for(int i = 0; i < size; i++){
                TreeNode temp = q.poll();
                l.add(temp.val);
                if(temp.left != null) q.offer(temp.left);
                if(temp.right != null) q.offer(temp.right);
            }
            s.add(l);
        }
        
        while(s.size() != 0){
            result.add(s.pop());
        }
        return result;
    }

}
