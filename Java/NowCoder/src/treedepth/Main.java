package treedepth;

/**
 * @author : Qingfeng
 * @date : 2018/6/19
 */
public class Main {
    public static void main(String[] args) {
        TreeDepth treeDepth = new TreeDepth();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.right = new TreeNode(5);
        root.right.right.right = new TreeNode(6);

        System.out.println(treeDepth.treeDepth(root));
    }
}
