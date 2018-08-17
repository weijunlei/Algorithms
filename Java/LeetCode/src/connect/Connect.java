package connect;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Qingfeng
 * @date : 2018/8/17
 * 题目：每个节点的右向指针
 * 题目链接: https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/32/trees-and-graphs/88/
 */
public class Connect {
    public void connect(TreeLinkNode root){
        if (root == null){
            return;
        }

        Queue<TreeLinkNode> queue = new LinkedList<>();

        queue.add(root);
        int queueSize = 1;
        int tempCount = 0;

        while(!queue.isEmpty()){
            tempCount ++;
            TreeLinkNode tempNode = ((LinkedList<TreeLinkNode>) queue).pop();
            if (tempNode.left != null){
                queue.add(tempNode.left);
            }
            if (tempNode.right != null){
                queue.add(tempNode.right);
            }
            if (tempCount == queueSize){
                queueSize = queue.size();
                tempCount = 0;
            }else{
                tempNode.next = queue.peek();
            }
        }
    }
}
