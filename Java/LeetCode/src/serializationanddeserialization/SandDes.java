package serializationanddeserialization;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Qingfeng
 * @date : 2018/8/29
 */
public class SandDes {
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        if (root == null){
            return "null";
        }
        StringBuilder sb = new StringBuilder();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode tempNode = queue.remove();
//            System.out.println(sb.toString());
            if (tempNode != root){
                sb = sb.append(",");
            }
            if (tempNode == null){
                sb = sb.append("null");
            }
            else{
                queue.add(tempNode.left);
                queue.add(tempNode.right);
                sb = sb.append(tempNode.val);
            }
        }
        while (sb.length() > 4 && sb.substring(sb.length() - 4, sb.length()).equals("null")){
            sb.delete(sb.length() - 5, sb.length());
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        String[] nums = data.split(",");
        if (nums[0].equals("null")){
            TreeNode result = null;
            return result;
        }
        TreeNode root = new TreeNode(Integer.parseInt(nums[0]));

        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        int numsIndex = 0;
        int numsLength = nums.length;
        while (!queue.isEmpty()){
            TreeNode tempNode = queue.remove();
            // 注意边界情况
            if (numsIndex < numsLength - 1 && !nums[numsIndex + 1].equals("null")){
                tempNode.left = new TreeNode(Integer.parseInt(nums[numsIndex + 1]));
                queue.add(tempNode.left);
            }
            if (numsIndex < numsLength - 2 && !nums[numsIndex + 2].equals("null")){
                tempNode.right = new TreeNode(Integer.parseInt(nums[numsIndex + 2]));
                queue.add(tempNode.right);
            }
            numsIndex += 2;
        }

        return root;

    }
}
