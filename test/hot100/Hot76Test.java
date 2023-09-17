package hot100;

import org.junit.Test;

public class Hot76Test {
    private final Hot76 hot76 = new Hot76();

    @Test
    public void test1() {
        System.out.println(hot76.minWindow("ADOBECODEBANC", "ABC"));
    }
    @Test
    public void test2() {
        System.out.println(hot76.minWindow("a", "a"));
    }
    @Test
    public void test3() {
        System.out.println(hot76.minWindow("a", "aa"));
    }
}
