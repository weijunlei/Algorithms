package reversepolishnotation;

import java.util.Stack;

/**
 * @author : Qingfeng
 * @date : 2018/8/30
 * 逆波兰表达式求值
 * https://leetcode-cn.com/explore/interview/card/top-interview-questions-medium/54/others/120/
 */
public class ReversePolishNotation {
    public int evalRPN(String[] tokens) {
        if (tokens == null || tokens.length == 0)
            return 0;
        Stack<Integer> intStack = new Stack<>();

        for(int i = 0; i < tokens.length; i++){
            if (!isOperator(tokens[i])){
                intStack.push(Integer.parseInt(tokens[i]));
            }else{
                int secondNum = intStack.pop();
                int firstNum = intStack.pop();
                switch (tokens[i]){
                    case "+":
                        intStack.push(firstNum + secondNum);
                        break;
                    case "-":
                        intStack.push(firstNum - secondNum);
                        break;
                    case "*":
                        intStack.push(firstNum * secondNum);
                        break;
                    case "/":
                        intStack.push(firstNum / secondNum);
                        break;
                }
            }
        }
        return intStack.pop();
    }

    private boolean isOperator(String str){
        if (str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/")){
            return true;
        }
        return false;
    }
}
