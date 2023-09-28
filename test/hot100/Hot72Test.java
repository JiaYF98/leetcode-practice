package hot100;

import org.junit.Test;

public class Hot72Test {
    private final Hot72 hot72 = new Hot72();

    @Test
    public void test1() {
        System.out.println(hot72.minDistance("horse", "ros"));
    }

    @Test
    public void test2() {
        System.out.println(hot72.minDistance("intention", "execution"));
    }

    @Test
    public void test3() {
        System.out.println(hot72.minDistance("diphe", "phe"));
    }

    @Test
    public void test4() {
        System.out.println(hot72.minDistance("mftion", "verkmykion"));
    }
}
