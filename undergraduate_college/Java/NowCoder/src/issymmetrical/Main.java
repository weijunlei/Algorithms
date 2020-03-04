package issymmetrical;

/**
 * @author : Qingfeng
 * @date : 2018/7/2
 */
public class Main {
    public static void main(String[] args){
        IsSymmetrical isSymmetrical = new IsSymmetrical();
        TreeNode pRoot = new TreeNode(0);
        pRoot.left = new TreeNode(1);
        pRoot.left.left = new TreeNode(2);
        pRoot.left.left.left = new TreeNode(3);
        pRoot.right = new TreeNode(1);
        pRoot.right.right = new TreeNode(2);
//        pRoot.right.right.right = new TreeNode(3);

        System.out.println(isSymmetrical.isSymmetrical(pRoot));
    }
}
