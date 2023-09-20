package hot100;

import org.junit.Test;

public class Hot32Test {
    private final Hot32 hot32 = new Hot32();

    @Test
    public void test1() {
        System.out.println(hot32.longestValidParentheses("(()"));
    }

    @Test
    public void test2() {
        System.out.println(hot32.longestValidParentheses(")()())"));
    }

    @Test
    public void test3() {
        System.out.println(hot32.longestValidParentheses(""));
    }

    @Test
    public void test4() {
        System.out.println(hot32.longestValidParentheses("(()(()"));
    }

    @Test
    public void test5() {
        System.out.println(hot32.longestValidParentheses("()()())()()()(()"));
    }
}
