package hot100;

import java.util.Stack;

public class Hot32 {
    public int longestValidParentheses(String s) {
        if (s.isEmpty()) {
            return 0;
        }

        char[] charArray = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        boolean[] isValid = new boolean[charArray.length];

        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty()) {
                    isValid[stack.pop()] = true;
                    isValid[i] = true;
                }
            }
        }

        int currentCount = 0;
        int longestCount = 0;

        for (boolean valid : isValid) {
            if (valid) {
                currentCount++;
            } else {
                longestCount = Math.max(currentCount, longestCount);
                currentCount = 0;
            }
        }

        return Math.max(currentCount, longestCount);
    }
}
