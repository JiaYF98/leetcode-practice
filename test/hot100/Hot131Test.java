package hot100;

import org.junit.Test;

public class Hot131Test {
    private final Hot131 hot131 = new Hot131();

    @Test
    public void test1() {
        System.out.println(hot131.partition("aab"));
    }

    @Test
    public void test2() {
        System.out.println(hot131.partition("a"));
    }

    @Test
    public void test3() {
        System.out.println(hot131.partition("aaaaa"));
    }
}
