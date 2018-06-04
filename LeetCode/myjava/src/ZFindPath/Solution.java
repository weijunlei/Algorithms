package ZFindPath;

import java.util.ArrayList;

public class Solution {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> trace = new ArrayList<>();
        if(root != null)
            DFS(root, target, result, trace);
        return result;
    }

    public void DFS(TreeNode root, int target, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> trace)
    {
        trace.add(root.val);
        if (root.left == null && root.right==null)
        {
            if(root.val == target)
                result.add(trace);
        }

        ArrayList<Integer> traceCopy = new ArrayList<>();
        traceCopy.addAll(trace);
        if(root.left != null)
            DFS(root.left, target - root.val, result, trace);
        if(root.right != null)
            DFS(root.right, target - root.val, result, traceCopy);
    }
}
