package ispoporder;

import java.util.Stack;

/**
 * @author : Qingfeng
 * @date : 2018/6/4
 */

public class IsPopOrder {
    public boolean isPopOrder(int[] pushA, int[] popA) {
        if ((pushA == null && popA != null) || (pushA != null && popA == null)) {
            return false;
        }
        Stack<Integer> stack = new Stack<>();
        int pushIndex = 0;
        int popIndex =0;

        for (int i = 0; i < pushA.length; i++) {
            stack.push(pushA[i]);

            while(!stack.isEmpty() && stack.peek() == popA[popIndex]) {
                stack.pop();
                popIndex ++;
            }
        }

        return popIndex == pushA.length;
    }
}
