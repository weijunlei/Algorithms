package convert;

/**
 * @author : Qingfeng
 * @date : 2018/6/10
 */
public class Convert {
    public TreeNode convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null || (pRootOfTree.left == null && pRootOfTree.right == null) ){
            return pRootOfTree;
        }

        TreeNode left = convert(pRootOfTree.left);
        TreeNode pre = left;
        while (pre != null && pre.right != null) {
            pre = pre.right;
        }

        if (left != null){
            pre.right = pRootOfTree;
            pRootOfTree.left = pre;
        }

        TreeNode right = convert(pRootOfTree.right);
        if (right != null){
            right.left = pRootOfTree;
            pRootOfTree.right = right;
        }

        return left == null ? left : pRootOfTree;
    }
}
