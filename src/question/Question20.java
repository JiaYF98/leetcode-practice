package question;

import java.util.ArrayDeque;
import java.util.Deque;

public class Question20 {
    public boolean isValid(String s) {
        char[] sCharArray = s.toCharArray();
        Deque<Character> stack = new ArrayDeque<>();

        for (char c : sCharArray) {
            if (stack.isEmpty() || c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (c == ')' && stack.peek() != '(' ||
                        c == ']' && stack.peek() != '[' ||
                        c == '}' && stack.peek() != '{') {
                    return false;
                } else {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }
}
