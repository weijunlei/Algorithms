package findpath;

/**
 * @author : Qingfeng
 * @date : 2018/6/4
 */

public class Main {
    public static void main(String[] args) {
        FindPath findPath = new FindPath();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(5);
        treeNode.left.left = new TreeNode(9);
        treeNode.left.right = new TreeNode(7);
        treeNode.right = new TreeNode(6);
        treeNode.right.left = new TreeNode(8);
        treeNode.right.right = new TreeNode(6);

        System.out.println(findPath.findPath(treeNode, 13));
    }
}
