package serializationanddeserialization;

/**
 * @author : Qingfeng
 * @date : 2018/8/29
 */
public class Main {
    public static void main(String[] args){
        SandDes sandDes = new SandDes();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
//        root.right = new TreeNode(2);
//        root.right.left = new TreeNode(3);
//        root.right.right = new TreeNode(4);
        System.out.println(sandDes.serialize(root));
        TreeNode copyRoot = sandDes.deserialize(sandDes.serialize(root));
        System.out.println(sandDes.serialize(copyRoot));
    }
}
