package printzhibinarytree;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @author : Qingfeng
 * @date : 2018/7/2
 */
public class PrintZhiBinaryTree {
    public ArrayList<ArrayList<Integer>> printZhiBinaryTree(TreeNode pRoot){
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        if (pRoot == null){
            return result;
        }

        Stack<TreeNode> isOddList = new Stack<>();
        Stack<TreeNode> notOddList = new Stack<>();
        isOddList.push(pRoot);

        while(!isOddList.isEmpty() || !notOddList.isEmpty()){
            ArrayList<Integer> floorList = new ArrayList<>();
            if (!isOddList.isEmpty()){
                while(!isOddList.isEmpty()){
                    TreeNode temp = isOddList.pop();
                    if (temp.left != null){
                        notOddList.push(temp.left);
                    }
                    if (temp.right != null){
                        notOddList.push(temp.right);
                    }
                    floorList.add(temp.val);
                }
            }
            else{
                while(!notOddList.isEmpty()){
                    TreeNode temp = notOddList.pop();
                    if (temp.right != null){
                        isOddList.push(temp.right);
                    }
                    if (temp.left != null){
                        isOddList.push(temp.left);
                    }
                    floorList.add(temp.val);
                }
            }
            result.add(floorList);
        }

        return result;
    }
}
