package printbfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Qingfeng
 * @date : 2018/7/4
 */
public class Print {
    public ArrayList<ArrayList<Integer>> print(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> results = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (pRoot == null){
            return results;
        }

        queue.offer(pRoot);
        int count = 1;
        int tempCount = 0;
        ArrayList<Integer> result = new ArrayList<>();
        while(!queue.isEmpty()){
            TreeNode tempNode = queue.poll();
            tempCount ++;
            if (tempNode.left != null){
                queue.offer(tempNode.left);
            }
            if (tempNode.right != null){
                queue.offer(tempNode.right);
            }
            result.add(tempNode.val);
            if (tempCount == count){
                count = queue.size();
                tempCount = 0;
                results.add(result);
                result = new ArrayList<>();
            }
        }

        return results;
    }
}
