package hassubtree;

/**
 * Author: FengQing
 * Eamil: qingfengwuyu233@gmail.com
 * Creation: 6/6/2018 2:46 PM
 **/

public class Main {
    public static void main(String[] args) {
        HasSubTree hasSubTree = new HasSubTree();
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(7);
        root1.left.left = new TreeNode(3);
        root1.left.right = new TreeNode(5);
        root1.right = new TreeNode(7);
        root1.right.left = new TreeNode(9);

        TreeNode root2 = new TreeNode(2);
        root2.left = new TreeNode(3);
        root2.right = new TreeNode(5);

        System.out.println(hasSubTree.hasSubTree(root1.right, root2));
    }
}
