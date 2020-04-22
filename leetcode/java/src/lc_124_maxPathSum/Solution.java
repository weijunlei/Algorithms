package lc_124_maxPathSum;

class Solution {
    private int result = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        maxPathCount(root);
        return result;
    }

    private int maxPathCount(TreeNode node){
        if (node == null){
            return 0;
        }

        int leftSum = Math.max(maxPathCount(node.left), 0);
        int rightSum = Math.max(maxPathCount(node.right), 0);

        int newSum = node.val + leftSum + rightSum;
        result = Math.max(result, newSum);

        return node.val + Math.max(leftSum, rightSum);
    }
}
