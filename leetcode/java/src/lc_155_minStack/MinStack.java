package lc_155_minStack;

import java.util.Stack;

class MinStack {

    /** initialize your data structure here. */
    private Stack<Integer> stack;
    private Stack<Integer> stackHelper;

    public MinStack() {
        stack = new Stack<>();
        stackHelper = new Stack<>();
    }

    public void push(int x) {
        stack.add(x);
        if (stackHelper.isEmpty() || x < stackHelper.peek()){
            stackHelper.add(x);
        }else {
            stackHelper.add(stackHelper.peek());
        }
    }

    public void pop() {
        if (!stack.isEmpty()){
            stack.pop();
            stackHelper.pop();
        } else {
            throw new RuntimeException("Stack is empty!");
        }
    }

    public int top() {
        if (!stack.isEmpty()){
            return stack.peek();
        } else {
            throw new RuntimeException("Stack is empty!");
        }
    }

    public int getMin() {
        if (!stackHelper.isEmpty()){
            return stackHelper.peek();
        } else {
            throw new RuntimeException("Stack is empty!");
        }
    }
}
