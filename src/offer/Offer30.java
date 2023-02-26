package offer;

import java.util.Stack;

class MinStack {
    private Stack<Integer> stack;
    private Stack<Integer> minValue;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        stack = new Stack<>();
        minValue = new Stack<>();
        minValue.push(Integer.MAX_VALUE);
    }

    public void push(int x) {
        stack.push(x);
        if (x < minValue.peek()) {
            minValue.push(x);
        } else {
            minValue.push(minValue.peek());
        }
    }

    public void pop() {
        stack.pop();
        minValue.pop();
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return minValue.peek();
    }
}

public class Offer30 {
    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        System.out.println(minStack.min());
        minStack.pop();
        System.out.println(minStack.top());
        System.out.println(minStack.min());
    }
}
