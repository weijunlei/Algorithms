package printbfs;

import java.util.ArrayList;

/**
 * @author : Qingfeng
 * @date : 2018/7/4
 */
public class Main {
    public static void main(String[] args){
        Print print = new Print();
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
        pRoot.right.left.left = new TreeNode(11);
        pRoot.right.left.right = new TreeNode(12);
        pRoot.right.right.left = new TreeNode(13);

        ArrayList<ArrayList<Integer>> results = print.print(pRoot);
        for(ArrayList<Integer> i : results){
            System.out.println(i.toString());
        }

    }
}
