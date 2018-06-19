package treedepth;

/**
 * @author : Qingfeng
 * @date : 2018/6/19
 */
public class TreeDepth {
    public int treeDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int result = 0;
        int leftLength = treeDepth(root.left);
        int rightLength = treeDepth(root.right);

        result = 1 + (leftLength > rightLength ? leftLength : rightLength);

        return result;
    }
}
