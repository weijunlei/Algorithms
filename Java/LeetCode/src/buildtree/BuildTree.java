package buildtree;

/**
 * @author : Qingfeng
 * @date : 2018/8/17
 * 从前序与中序遍历序列构造二叉树
 * 题目链接：https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/32/trees-and-graphs/87/
 */
public class BuildTree {
    public TreeNode buildTree(int[] preorder, int[] inorder){
        if (preorder == null || inorder == null || preorder.length == 0 || inorder.length == 0 || (preorder.length != inorder.length)){
            return null;
        }

        TreeNode root = null;
        root = buildHelper(preorder, inorder, 0, preorder.length - 1, 0, inorder.length - 1);
        return root;
    }

    private TreeNode buildHelper(int[] preorder, int[] inorder, int pre_left, int pre_right, int in_left, int in_right){
        TreeNode root = new TreeNode(preorder[pre_left]);
        int rootIndex = in_left;

        while(inorder[rootIndex] != preorder[pre_left]){
            rootIndex++;
        }

        int leftLength = rootIndex - in_left;
        int rightLength = in_right - rootIndex;

        if (leftLength > 0){
            root.left = buildHelper(preorder, inorder, pre_left + 1, pre_left + leftLength, in_left, rootIndex - 1);
        }
        if (rightLength > 0){
            root.right = buildHelper(preorder, inorder, pre_left + leftLength + 1, pre_right, rootIndex + 1, in_right);
        }

        return root;
    }
}
