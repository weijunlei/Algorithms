package ispoporder;

/**
 * @author : Qingfeng
 * @date : 2018/6/4
 */

public class Main {
    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {1,2,3,4,5};
        IsPopOrder isPopOrder = new IsPopOrder();

        System.out.println(isPopOrder.isPopOrder(pushA, popA));
    }
}
