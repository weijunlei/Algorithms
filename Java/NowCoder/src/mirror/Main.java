package mirror;

/**
 * Author: FengQing
 * Email: qingfengwuyu233@gmail.com
 * Creation: 6/6/2018 3:05 PM
 **/

public class Main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(7);

        Mirror mirror = new Mirror();
        mirror.mirror(root);

        System.out.println(root.left.val);
    }
}
