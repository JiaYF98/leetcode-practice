package question;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res = new int[temperatures.length];

        // 单调栈
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                res[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }

        return res;
    }
}
