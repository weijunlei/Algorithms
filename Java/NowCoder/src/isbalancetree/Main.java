package isbalancetree;

/**
 * @author : Qingfeng
 * @date : 2018/6/19
 */
public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(8);
        root.right.right = new TreeNode(5);
        root.right.left = new TreeNode(9);
        root.right.right.right = new TreeNode(6);
        root.left.left.left = new TreeNode(7);

        IsBalancedTree isBalancedTree = new IsBalancedTree();

        System.out.println(isBalancedTree.isBalancedTree(root));
    }
}
