package hot100;

import org.junit.Test;

public class Hot5Test {
    private final Hot5 hot5 = new Hot5();

    @Test
    public void test1() {
        System.out.println(hot5.longestPalindrome("babad"));
    }

    @Test
    public void test2() {
        System.out.println(hot5.longestPalindrome("cbbd"));
    }
}
