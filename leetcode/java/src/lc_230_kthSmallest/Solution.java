package lc_230_kthSmallest;

class Solution {
    int numCount;
    int result;

    public int kthSmallest(TreeNode root, int k) {
        numCount = 0;
        addSearchNum(root, k);
        return result;
    }

    private void addSearchNum(TreeNode root, int k){
        if (root == null || numCount > k){
            return;
        }
        addSearchNum(root.left, k);
        numCount ++;
        if (numCount == k){
            result = root.val;
        }
        addSearchNum(root.right, k);
    }
}
