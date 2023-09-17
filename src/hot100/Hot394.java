package hot100;

import java.util.Stack;

public class Hot394 {
    public String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        char[] sCharArray = s.toCharArray();
        for (char c : sCharArray) {
            if (c <= '9' && c >= '0' || c == '[' || c >= 'a' && c <= 'z') {
                stack.push(c);
            } else if (c == ']') {
                StringBuilder sb = new StringBuilder();
                while (stack.peek() != '[') {
                    sb.append(stack.pop());
                }

                stack.pop();

                int k = 0;
                int count = 1;
                while (!stack.isEmpty() && stack.peek() <= '9' && stack.peek() >= '0') {
                    k += (stack.pop() - '0') * count;
                    count *= 10;
                }

                for (int i = 0; i < k; i++) {
                    for (int j = sb.length() - 1; j >= 0; j--) {
                        stack.push(sb.charAt(j));
                    }
                }
            }
        }

        StringBuilder resultReverse = new StringBuilder();
        while (!stack.isEmpty()) {
            resultReverse.append(stack.pop());
        }

        return resultReverse.reverse().toString();
    }
}
