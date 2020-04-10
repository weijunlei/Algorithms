package lc_230_kthSmallest;

import java.util.Stack;

class Solution2 {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        while(true){
            while (root != null){
                stack.push(root);
                root = root.left;
            }
            root = stack.pop();
            k --;
            if (k == 0) return root.val;
            root = root.right;
        }
    }
}
