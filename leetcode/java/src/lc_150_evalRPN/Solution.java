package lc_150_evalRPN;

import java.util.Stack;

class Solution {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0){
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int num1 = 0;
        int num2 = 0;
        for(String token: tokens){
            if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")){
                num1 = stack.pop();
                num2 = stack.pop();
                switch(token){
                    case "+":
                        stack.push(num1 + num2);
                        break;
                    case "-":
                        stack.push(num2 - num1);
                        break;
                    case "*":
                        stack.push(num2 * num1);
                        break;
                    case "/":
                        stack.push(num2 / num1);
                }
            } else {
                stack.push(Integer.valueOf(token));
            }
        }
        return stack.pop();
    }
}
