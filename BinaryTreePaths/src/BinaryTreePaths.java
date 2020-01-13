import java.util.ArrayList;
import java.util.List;


public class BinaryTreePaths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeNode t1 = new TreeNode(1);
		TreeNode t2 = new TreeNode(2);
		TreeNode t3 = new TreeNode(3);
		TreeNode t4 = new TreeNode(5);
		
		t1.left = t2;
		t1.right = t3;
		t2.right = t4;
		
		System.out.println(binaryTreePaths(t1));
	}
	
	private static List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> arr = new ArrayList<>();
		return helper(arr, root, "");
    }
	
	private static List<String> helper(ArrayList<String> arr,TreeNode root, String sb){
		if(root == null) return arr;
        if(root.left  == null && root.right == null) {
        	arr.add(sb+root.val);
        }
        if(root.left != null) helper(arr, root.left, sb+root.val+"->");
        if(root.right != null) helper(arr, root.right, sb+root.val+"->");
		return arr;
	}

}
