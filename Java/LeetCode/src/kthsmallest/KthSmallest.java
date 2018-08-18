package kthsmallest;

/**
 * @author : Qingfeng
 * @date : 2018/8/18
 * 题目：二叉搜索树中第K小的元素
 */
public class KthSmallest {
    int kth;
    public int kthSmallest(TreeNode root, int k) {
        if (root == null || k <= 0){
            return 0;
        }
        kth = 0;
        TreeNode result = kthHelper(root, k);
        return result == null ? 0 : result.val;
    }

    private TreeNode kthHelper(TreeNode root, int k){
        if (root != null){
            TreeNode node = kthHelper(root.left, k);
            if (node != null){
                return node;
            }
            kth ++;
            if (kth == k){
                return root;
            }
            node = kthHelper(root.right, k);
            if (node != null){
                return node;
            }
        }
        return null;
    }
}
