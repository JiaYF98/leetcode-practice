package question;

import java.util.ArrayDeque;
import java.util.Deque;

class MyQueue {
    private final Deque<Integer> deque1;
    private final Deque<Integer> deque2;

    public MyQueue() {
        deque1 = new ArrayDeque<>();
        deque2 = new ArrayDeque<>();
    }

    public void push(int x) {
        deque1.push(x);
    }

    public int pop() {
        exchange();
        return deque2.pop();
    }

    private void exchange() {
        if (deque2.isEmpty()) {
            while (!deque1.isEmpty()) {
                deque2.push(deque1.pop());
            }
        }
    }

    public int peek() {
        exchange();
        return deque2.peek();
    }

    public boolean empty() {
        return deque1.isEmpty() && deque2.isEmpty();
    }
}

public class Question232 {
    private final MyQueue myQueue;

    public Question232() {
        myQueue = new MyQueue();
    }

    public void push(int x) {
        myQueue.push(x);
    }

    public int pop() {
        return myQueue.pop();
    }

    public int peek() {
        return myQueue.peek();
    }

    public boolean empty() {
        return myQueue.empty();
    }
}
