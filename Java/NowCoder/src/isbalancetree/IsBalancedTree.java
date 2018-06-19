package isbalancetree;

/**
 * @author : Qingfeng
 * @date : 2018/6/19
 */
public class IsBalancedTree {
    boolean result = true;
    public boolean isBalancedTree(TreeNode root) {
        if (root == null){
            return false;
        }
        int getDepth = getDepth(root);
        return result;
    }

    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftLength = getDepth(root.left);
        int rightLength = getDepth(root.right);

        if (leftLength - rightLength > 1 || (leftLength - rightLength) < -1) {
            result = false;
        }

        return (leftLength > rightLength ? leftLength : rightLength) + 1;
    }
}
