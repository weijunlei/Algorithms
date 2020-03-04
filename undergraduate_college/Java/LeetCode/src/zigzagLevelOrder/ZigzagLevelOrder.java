package zigzagLevelOrder;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @author : Qingfeng
 * @date : 2018/8/17
 * 题目链接：https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/32/trees-and-graphs/86/
 * 题目名：二叉树的锯齿形层次遍历
 */
public class ZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root){
        List<List<Integer>> results = new ArrayList<>();
        if (root == null){
            return results;
        }
        Stack<TreeNode> oddStack = new Stack<>();
        Stack<TreeNode> evenStack = new Stack<>();

        oddStack.add(root);
        while (!oddStack.isEmpty() || !evenStack.isEmpty()){
            List<Integer> result = new ArrayList<>();
            if (!oddStack.isEmpty()){
                while(!oddStack.isEmpty()){
                    TreeNode tempNode = oddStack.pop();
                    result.add(tempNode.val);
                    if (tempNode.left != null){
                        evenStack.push(tempNode.left);
                    }
                    if (tempNode.right != null){
                        evenStack.push(tempNode.right);
                    }
                }
                if ( !result.isEmpty()){
                    results.add(result);
                }
            }
            else{
                while(!evenStack.isEmpty()){
                    TreeNode tempNode = evenStack.pop();
                    result.add(tempNode.val);
                    if (tempNode.right != null){
                        oddStack.push(tempNode.right);
                    }
                    if (tempNode.left != null){
                        oddStack.push(tempNode.left);
                    }
                }
                if (!result.isEmpty()){
                    results.add(result);
                }
            }
        }

        return results;
    }
}
