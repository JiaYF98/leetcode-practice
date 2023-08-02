package hot100;

import java.util.Stack;

public class Hot739 {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> temperaturesStack = new Stack<>();
        Stack<Integer> index = new Stack<>();
        int length = temperatures.length;
        int[] res = new int[length];

        for (int i = 0; i < length; i++) {
            while (!temperaturesStack.isEmpty() && temperatures[i] > temperaturesStack.peek()) {
                Integer prevIndex = index.pop();
                res[prevIndex] = i - prevIndex;
                temperaturesStack.pop();
            }

            temperaturesStack.push(temperatures[i]);
            index.push(i);

        }

        return res;
    }
}
