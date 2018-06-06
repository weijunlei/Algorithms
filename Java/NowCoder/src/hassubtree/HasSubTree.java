package hassubtree;

/**
 * Author: FengQing
 * Eamil: qingfengwuyu233@gmail.com
 * Creation: 6/6/2018 2:34 PM
 **/

public class HasSubTree {
    public boolean hasSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null || root1 == null){
            return false;
        }

        boolean result = isSubTree(root1, root2);
        if (!result && root1.left != null) {
            result = hasSubTree(root1.left, root2);
        }
        if (!result && root1.right != null) {
            result = hasSubTree(root1.right, root2);
        }

        return result;
    }

    private boolean isSubTree(TreeNode root1, TreeNode root2) {
        if (root2 == null) {
            return true;
        }
        if (root1 == null) {
            return false;
        }
        if (root1.val == root2.val) {
            return isSubTree(root1.left, root2.left) && isSubTree(root1.right, root2.right);
        }

        return false;
    }
}
