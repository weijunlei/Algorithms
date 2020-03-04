package kthsmallest;

/**
 * @author : Qingfeng
 * @date : 2018/8/18
 */
public class Main {
    public static void main(String[] args){
        KthSmallest kthSmallest = new KthSmallest();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);

        System.out.println(kthSmallest.kthSmallest(root, 3));
    }
}
