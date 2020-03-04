package serialize;

import printbfs.TreeNode;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Qingfeng
 * @date : 2018/7/4
 */
public class Serialize {
    String serialize(TreeNode root){
        if (root == null){
            return "#,";
        }
        String result = root.val + ",";
        result += serialize(root.left);
        result += serialize(root.right);

        return result;
    }

    public TreeNode deSerialize(String str){
        String[] treeNodes = str.split(",");
        Queue<String> queue = new LinkedList<>();
        for(String i : treeNodes){
            queue.offer(i);
        }

        return preTraverse(queue);
    }

    private TreeNode preTraverse(Queue<String> queue){
        String getString = queue.poll();
        if (getString.equals("#")){
            return null;
        }

        TreeNode root = new TreeNode(Integer.valueOf(getString));
        root.left = preTraverse(queue);
        root.right = preTraverse(queue);

        return root;
    }
}
