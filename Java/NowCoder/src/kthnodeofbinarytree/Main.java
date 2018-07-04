package kthnodeofbinarytree;

/**
 * @author : Qingfeng
 * @date : 2018/7/4
 * 中序遍历实现寻找二叉搜索树的第k个节点
 */
public class Main {
    public static void main(String[] args){
        KthNode kthNode = new KthNode();
        TreeNode treeRoot = new TreeNode(12);
        treeRoot.left = new TreeNode(9);
        treeRoot.right = new TreeNode(16);
        treeRoot.left.left = new TreeNode(7);
        treeRoot.left.right = new TreeNode(11);
        treeRoot.right.left = new TreeNode(13);
        treeRoot.right.right = new TreeNode(14);

        System.out.println(kthNode.kthNode(treeRoot, 5).val);
    }
}
