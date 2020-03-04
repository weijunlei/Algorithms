package mirror;

/**
 * Author: FengQing
 * Email: qingfengwuyu233@gmail.com
 * Creation: 6/6/2018 3:01 PM
 **/

public class Mirror {
    public void mirror(TreeNode root) {
        if (root == null) {
            return;
        }

        TreeNode tempTree = root.left;
        root.left = root.right;
        root.right = tempTree;
        mirror(root.left);
        mirror(root.right);
    }
}
