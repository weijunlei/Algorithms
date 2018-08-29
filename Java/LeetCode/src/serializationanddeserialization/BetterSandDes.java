package serializationanddeserialization;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : Qingfeng
 * @date : 2018/8/29
 */
public class BetterSandDes {
    // Encodes a tree to a single string.
    public List<Integer> serialize(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        dfs(result, root);
        return result;
    }

    private void dfs(List<Integer> result, TreeNode root) {
        if (root == null) {
            result.add(null);
            return;
        }
        result.add(root.val);
        dfs(result, root.left);
        dfs(result, root.right);
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(List<Integer> data) {
        int[] index = new int[1];
        index[0] = -1;
        TreeNode result = build(index, data);
        return result;
    }

    private TreeNode build(int[] index, List<Integer> data) {
        index[0]++;
        if (data.get(index[0]) == null) {
            return null;
        }
        TreeNode node = new TreeNode(data.get(index[0]));
        node.left = build(index, data);
        node.right = build(index, data);
        return node;
    }
}
