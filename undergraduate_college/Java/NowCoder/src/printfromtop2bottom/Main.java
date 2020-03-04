package printfromtop2bottom;

/**
 * @author : Qingfeng
 * @date : 2018/6/4
 */
public class Main {
    public static void main(String[] args) {
        PrintFromTop2Bottom printFromTop2Bottom = new PrintFromTop2Bottom();
        TreeNode root = new TreeNode(9);
        root.left = new TreeNode(10);
        root.right = new TreeNode(11);
        root.left.right = new TreeNode(12);

        System.out.print(printFromTop2Bottom.printFromTop2Bottom(root));
    }
}
