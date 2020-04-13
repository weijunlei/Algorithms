package lc_297_codec;

import java.util.LinkedList;
import java.util.Queue;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        queue.add(root);
        while (!queue.isEmpty()){
            TreeNode pre = queue.poll();
            if (pre == null){
                sb.append("n");
                sb.append(",");
                continue;
            }else{
                sb.append(String.valueOf(pre.val));
                sb.append(",");
            }
            queue.offer(pre.left);
            queue.offer(pre.right);
        }
        int neededLength = sb.length() - 1;
        // strip speed
        while(neededLength > 2 && sb.charAt(neededLength - 1) == 'n'){
            neededLength -= 2;
        }
        sb.setLength(neededLength);
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if (data.equals("n")){
            return null;
        }
        String[] vals = data.split(",");
        TreeNode root = new TreeNode(Integer.valueOf(vals[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        for(int i = 1; i < vals.length; i += 2){
            if (queue.isEmpty()){
                break;
            }
            TreeNode pre = queue.poll();
            if (vals[i].equals("n")){
                pre.left = null;
            }else{
                TreeNode left = new TreeNode(Integer.valueOf(vals[i]));
                pre.left = left;
                queue.offer(left);
            }
            if (i + 1 >= vals.length){
                break;
            }
            if (vals[i + 1].equals("n")){
                pre.right = null;
            }else{
                TreeNode right = new TreeNode(Integer.valueOf(vals[i + 1]));
                pre.right = right;
                queue.offer(right);
            }
        }
        return root;
    }
}
