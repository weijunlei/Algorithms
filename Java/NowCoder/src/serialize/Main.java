package serialize;

import printbfs.Print;
import printbfs.TreeNode;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * @author : Qingfeng
 * @date : 2018/7/4
 * 前序遍历实现
 */
public class Main {
    public static void main(String[] args){
        Serialize serialize = new Serialize();
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

        System.out.println(serialize.serialize(pRoot));
        String result = serialize.serialize(pRoot);
        TreeNode tempRoot = serialize.deSerialize(result);
        Print bfsprint = new Print();
        ArrayList<ArrayList<Integer>> results = bfsprint.print(tempRoot);
        for(ArrayList<Integer> i : results){
            System.out.println(i.toString());
        }
    }
}
