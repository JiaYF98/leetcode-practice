package hot100;

import org.junit.Test;

public class Hot322Test {
    private final Hot322 hot322 = new Hot322();

    @Test
    public void test1() {
        System.out.println(hot322.coinChange(new int[]{1, 2, 5}, 11));
    }

    @Test
    public void test2() {
        System.out.println(hot322.coinChange(new int[]{2}, 3));
    }

    @Test
    public void test3() {
        System.out.println(hot322.coinChange(new int[]{1}, 0));
    }

    @Test
    public void test4() {
        System.out.println(hot322.coinChange(new int[]{1, 2}, 13));
    }
}
