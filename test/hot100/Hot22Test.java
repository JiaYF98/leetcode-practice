package hot100;

import org.junit.Test;

public class Hot22Test {
    private final Hot22 hot22 = new Hot22();

    @Test
    public void test1() {
        System.out.println(hot22.generateParenthesis(3));
    }

    @Test
    public void test2() {
        System.out.println(hot22.generateParenthesis(1));
    }

    @Test
    public void test3() {
        System.out.println(hot22.generateParenthesis(8));
    }
}
