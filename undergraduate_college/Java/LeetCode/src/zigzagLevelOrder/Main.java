package zigzagLevelOrder;

import java.util.List;

/**
 * @author : Qingfeng
 * @date : 2018/8/17
 */
public class Main {
    public static void main(String[] args){
        ZigzagLevelOrder zigzagLevelOrder = new ZigzagLevelOrder();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        List<List<Integer>> result = zigzagLevelOrder.zigzagLevelOrder(root);

        for(List<Integer> li : result){
            System.out.println(li.toString());
        }
    }
}
