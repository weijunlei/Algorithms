package issymmetrical;

/**
 * @author : Qingfeng
 * @date : 2018/7/2
 */
public class IsSymmetrical {
    boolean isSymmetrical(TreeNode pRoot){
        if (pRoot == null){
            return true;
        }

        return isSymmetricalHelper(pRoot.left, pRoot.right);
    }

    boolean isSymmetricalHelper(TreeNode pLeft, TreeNode pRight){
        if (pLeft == null) {
            return pRight == null;
        }
        else if (pRight == null){
            return false;
        }
        if (pLeft.val != pRight.val){
            return false;
        }
        // 关键一步，将左子树的两个节点和右子树的两个节点递归对比
        return isSymmetricalHelper(pLeft.left, pRight.right) && isSymmetricalHelper(pLeft.right, pRight.left);
    }
}
