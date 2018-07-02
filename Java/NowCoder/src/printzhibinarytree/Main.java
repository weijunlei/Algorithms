package printzhibinarytree;

import java.util.ArrayList;

/**
 * @author : Qingfeng
 * @date : 2018/7/2
 */
public class Main {
    public static void main(String[] args){
        PrintZhiBinaryTree printZhiBinaryTree = new PrintZhiBinaryTree();
        TreeNode pRoot = new TreeNode(0);
        pRoot.left = new TreeNode(1);
        pRoot.right = new TreeNode(2);
        pRoot.left.left = new TreeNode(3);
        pRoot.left.right = new TreeNode(4);
        pRoot.right.left = new TreeNode(5);
        pRoot.right.right = new TreeNode(6);
        pRoot.left.left.left = new TreeNode(7);
        pRoot.left.left.right = new TreeNode(8);
        pRoot.left.right.left = new TreeNode(9);
        pRoot.left.right.right = new TreeNode(10);

        ArrayList<ArrayList<Integer>> result = printZhiBinaryTree.printZhiBinaryTree(pRoot);

        for(ArrayList<Integer> i : result){
            System.out.println(i.toString());
        }
    }
}
