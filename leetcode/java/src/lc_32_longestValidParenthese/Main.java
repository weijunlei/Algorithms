package lc_32_longestValidParenthese;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        List<String> parentheses = Arrays.asList("()", ")()())");
        for(int i = 0; i < parentheses.size(); i++){
            String getStr = parentheses.get(i);
            System.out.println("longest valid parentheses of " + getStr + " is: " + solution.longestValidParentheses(getStr));
        }
    }
}
