package lc_227_calculate;

import java.util.Stack;

class Solution {
    public int calculate(String s) {
        if (s == null || s.length() == 0){
            return 0;
        }

        int result = 0;
        int tempNum = 0;
        char tempOp = '+';
        int getNum = 0;
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9'){

                tempNum = tempNum * 10 + ch - '0';
            }
            if ((ch != ' ' && (ch < '0' || ch  > '9')) || i == s.length() - 1){
                switch(tempOp){
                    case '+':
                        stack.push(tempNum);
                        break;
                    case '-':
                        stack.push(-tempNum);
                        break;
                    case '*':
                        getNum = stack.peek() * tempNum;
                        stack.pop();
                        stack.push(getNum);
                        break;
                    case '/':
                        getNum = stack.peek() / tempNum;
                        stack.pop();
                        stack.push(getNum);
                        break;
                }
                tempNum = 0;
                tempOp = ch;
            }
        }
        while(!stack.isEmpty()){
            result += stack.pop();
        }
        return result;
    }
}
