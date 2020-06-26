import java.util.concurrent.atomic.AtomicInteger;

public class SumRoottoLeafNumbers {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(3);
        root.left = n1;
        root.right = n2;
        System.out.println(sumNumbers(root));
    }

    private static int sumNumbers(TreeNode root) {
        if(root == null) return 0;
        AtomicInteger sum = new AtomicInteger(0);
        makeNums(root, 0, sum);
        return sum.get();
    }

    private static void makeNums(TreeNode root, int num, AtomicInteger sum){
        if(root == null) return;
        if(root.left == null && root.right == null){
            num = root.val + num * 10;
            System.out.println(num);
            sum.set(sum.addAndGet(num));
        }

        makeNums(root.left, root.val + num * 10, sum);
        makeNums(root.right, root.val + num * 10, sum);
    }
}
