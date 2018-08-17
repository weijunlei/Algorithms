package connect;

/**
 * @author : Qingfeng
 * @date : 2018/8/17
 */
public class Main {
    public static void main(String[] args){
        Connect connect = new Connect();
        TreeLinkNode root = new TreeLinkNode(1);
        root.left = new TreeLinkNode(2);
        root.right = new TreeLinkNode(3);
        root.left.left = new TreeLinkNode(4);
        root.left.right = new TreeLinkNode(5);
        root.right.left = new TreeLinkNode(6);
        root.right.right = new TreeLinkNode(7);

        System.out.println("Hello World\n");
    }
}
