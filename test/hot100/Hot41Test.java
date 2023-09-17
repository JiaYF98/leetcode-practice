package hot100;

import org.junit.Test;

public class Hot41Test {
    private final Hot41 hot41 = new Hot41();

    @Test
    public void test1() {
        System.out.println(hot41.firstMissingPositive(new int[]{1, 2, 0}));
    }

    @Test
    public void test2() {
        System.out.println(hot41.firstMissingPositive(new int[]{3, 4, -1, 1}));
    }

    @Test
    public void test3() {
        System.out.println(hot41.firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
    }
}
