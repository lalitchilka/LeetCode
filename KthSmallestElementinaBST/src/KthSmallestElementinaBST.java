import java.util.concurrent.atomic.AtomicInteger;

public class KthSmallestElementinaBST {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        TreeNode t2 = new TreeNode(1);
        TreeNode t3 = new TreeNode(4);
        TreeNode t4 = new TreeNode(2);
        t1.left = t2;
        t1.right = t3;
        t2.right = t4;
        System.out.println(kthSmallest(t1, 2));
    }

    public static int kthSmallest(TreeNode root, int k) {
        AtomicInteger result = new AtomicInteger();
        AtomicInteger count = new AtomicInteger();
        inOrderTravel(root, k, count, result);
        return result.get();
    }

    public static void inOrderTravel(TreeNode root, int k, AtomicInteger count, AtomicInteger result){
        if(root.left != null) inOrderTravel(root.left, k, count, result);
        count.getAndIncrement();
        if(count.get() == k){
            result.set(root.val);
            return;
        }
        if(root.right != null) inOrderTravel(root.right, k, count, result);
    }
}
