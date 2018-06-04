package ZReConstructBinaryTree;

public class Solution {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if (pre == null || in == null || pre.length == 0 || in.length == 0)
            return null;
        return reBuildTree(pre, in, 0, pre.length - 1, 0, in.length - 1);
    }
    public TreeNode reBuildTree(int [] pre, int[] in, int startPre, int endPre, int startIn, int endIn){
        TreeNode root = new TreeNode(pre[startPre]);
        int rootIndex = startIn;
        for(;rootIndex < in.length; rootIndex++)
            if (in[rootIndex] == root.val)
                break;
        int leftLength = rootIndex - startIn;
        int rightLength = endIn - rootIndex;
        if (leftLength != 0)
            root.left = reBuildTree(pre, in, startPre + 1, startPre + leftLength, startIn, rootIndex - 1);
        if (rightLength != 0)
            root.right = reBuildTree(pre, in, startPre + leftLength + 1, endPre, rootIndex + 1, endIn);
        return root;
    }
}
