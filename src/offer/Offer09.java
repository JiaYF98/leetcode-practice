package offer;

import java.util.Stack;

class CQueue {
    private final Stack<Integer> inStack;
    private final Stack<Integer> outStack;

    public CQueue() {
        inStack = new Stack<>();
        outStack = new Stack<>();
    }

    public void appendTail(int value) {
        inStack.push(value);
    }

    public int deleteHead() {
        if (outStack.isEmpty()) {
            if (inStack.isEmpty()) {
                return -1;
            }
            while (!inStack.isEmpty()) {
                outStack.push(inStack.pop());
            }
        }
        return outStack.pop();
    }
}

/**
 * Your offer.CQueue object will be instantiated and called as such:
 * offer.CQueue obj = new offer.CQueue();
 * obj.appendTail(value);
 * int param_2 = obj.deleteHead();
 */

public class Offer09 {
    public static void main(String[] args) {
        CQueue queue = new CQueue();
        System.out.println(queue.deleteHead());
        queue.appendTail(5);
        queue.appendTail(2);
        System.out.println(queue.deleteHead());
        System.out.println(queue.deleteHead());
    }

}


