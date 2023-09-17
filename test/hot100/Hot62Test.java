package hot100;

import org.junit.Test;

public class Hot62Test {
    private final Hot62 hot62 = new Hot62();

    @Test
    public void test1() {
        System.out.println(hot62.uniquePaths(3, 7));
    }

    @Test
    public void test2() {
        System.out.println(hot62.uniquePaths(3, 2));
    }

    @Test
    public void test3() {
        System.out.println(hot62.uniquePaths(7, 3));
    }

    @Test
    public void test4() {
        System.out.println(hot62.uniquePaths(3, 3));
    }
}
