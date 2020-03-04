package lc_32_longestValidParenthese;

//执行用时 :7 ms, 在所有 Java 提交中击败了39.47%的用户
//内存消耗 :39.4 MB, 在所有 Java 提交中击败了5.04%的用户

import java.util.Stack;

public class Solution {
    public int longestValidParentheses(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        int[] dps = new int[s.length()];
        int matchIndex = 0;
        int curLength = 0;
        int result = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char newChar = s.charAt(i);
            if (newChar == '(') {
                stack.push(i);
            }
            else{
                if (!stack.isEmpty()) {
                    matchIndex = stack.pop();
                    curLength = i - matchIndex + 1;
                    if (matchIndex - 1 > 0) {
                        curLength += dps[matchIndex - 1];
                    }
                    dps[i] = curLength;
                    if (curLength > result) {
                        result = curLength;
                    }
                }
            }
        }
        return result;
    }
}
