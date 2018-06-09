package findpath;

import java.util.ArrayList;

/**
 * @author : Qingfeng
 * @date : 2018/6/4
 */

public class FindPath {
    public ArrayList<ArrayList<Integer>> findPath(TreeNode root, int target) {
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        ArrayList<Integer> trace = new ArrayList<>();
        if (root == null){
            return result;
        }
        findPathHelper(root, target, result, trace);
        return result;
    }

    private void  findPathHelper(TreeNode root, int target, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> trace) {
        trace.add(root.val);
        if (root != null && root.left == null && root.right == null) {
            if (root.val == target) {
                result.add(trace);
            }
        }

        ArrayList<Integer> traceCopy = new ArrayList<>();
        traceCopy.addAll(trace);
        if (root.left != null) {
            findPathHelper(root.left, target - root.val, result, trace);
        }
        if (root.right != null) {
            findPathHelper(root.right, target - root.val, result, traceCopy);
        }
    }
}
