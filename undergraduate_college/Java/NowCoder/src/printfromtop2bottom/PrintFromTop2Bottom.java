package printfromtop2bottom;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Qingfeng
 * @date : 2018/6/4
 */
public class PrintFromTop2Bottom {
    public ArrayList<Integer> printFromTop2Bottom(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null) {
            return result;
        }
        queue.add(root);

        while (!queue.isEmpty()) {
            TreeNode tempNode = ((LinkedList<TreeNode>) queue).pop();
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
            result.add(tempNode.val);
        }
        return result;
    }
}
