package kthnodeofbinarytree;

/**
 * @author : Qingfeng
 * @date : 2018/7/4
 */
public class KthNode {
    int index = 0;
    public TreeNode kthNode(TreeNode pRoot, int k){
        if (k <= 0 || pRoot == null){
            return null;
        }

        TreeNode node = kthNode(pRoot.left, k);
        if (node != null){
            return node;
        }
        index ++;
        if (index == k){
            return pRoot;
        }

        node = kthNode(pRoot.right, k);
        if (node != null){
            return node;
        }

        return null;
    }
}
