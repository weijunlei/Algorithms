package lc_236_lowestCommonAncestor;

class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode result = new TreeNode(0);
        commonHelper(root, p, q, result);
        return result.left;
    }

    private boolean commonHelper(TreeNode root, TreeNode p, TreeNode q, TreeNode result){
        if (root == null){
            return false;
        }

        int left = commonHelper(root.left, p, q, result) ? 1: 0;
        int right = commonHelper(root.right, p, q, result) ? 1: 0;
        int mid = 0;
        if (root == p || root == q){
            mid = 1;
        }
        if (mid + left + right >= 2){
            System.out.println(root.val);
            result.left = root;
        }
        return (mid + left + right) > 0;
    }
}
