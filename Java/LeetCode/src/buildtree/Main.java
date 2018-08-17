package buildtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author : Qingfeng
 * @date : 2018/8/17
 */
public class Main {
    public  static void main(String[] args){
        BuildTree buildTree = new BuildTree();
        int[] preorder = {3, 9, 20, 15, 7};
        int[] inorder = {9, 3, 15, 20, 7};
        TreeNode root = buildTree.buildTree(preorder, inorder);

        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){
            TreeNode tempNode = ((LinkedList<TreeNode>) queue).pop();
            if (tempNode != null){
                result.add(tempNode.val);
                if (tempNode.left != null){
                    queue.add(tempNode.left);
                }
                if (tempNode.right != null){
                    queue.add(tempNode.right);
                }
            }
        }

        System.out.println(result.toString());

    }
}
