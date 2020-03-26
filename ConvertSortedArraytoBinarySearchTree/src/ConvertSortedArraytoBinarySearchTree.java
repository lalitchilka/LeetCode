
public class ConvertSortedArraytoBinarySearchTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {-10,-3,0,5,9};
		sortedArrayToBST(nums);
	}
	
	private static TreeNode sortedArrayToBST(int[] nums) {
		if(nums.length == 0) return null;
		return helper(nums, 0, nums.length - 1);
	}
	
	private static TreeNode helper(int[] nums, int left, int right) {
		if(left > right) return null;
		int mid = left + (right - left) / 2;
		TreeNode node = new TreeNode(nums[mid]);
		node.left = helper(nums, left, mid - 1);
		node.right = helper(nums, mid + 1, right);
		return node;
	}

}
