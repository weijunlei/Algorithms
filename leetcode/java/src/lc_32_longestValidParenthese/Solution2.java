package lc_32_longestValidParenthese;
//执行用时:8ms,在所有Java提交中击败了35.52%的用户内存消耗:38.8MB,在所有Java提交中击败了5.04%的用户

import java.util.Stack;

public class Solution2 {
    public int longestValidParentheses(String s) {
        if (s == null || s.length() < 2) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        stack.push(-1);
        int result = 0;
        int tmp = 0;
        for (int i = 0; i < s.length(); i ++) {
            if (s.charAt(i) == '(') {
                stack.push(i);
            } else {
                stack.pop();
                if (stack.isEmpty()) {
                    stack.push(i);
                } else {
                    tmp = i - stack.peek();
                    result = result > tmp ? result : tmp;
                }
            }
        }
        return result;
    }
}
