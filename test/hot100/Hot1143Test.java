package hot100;

import org.junit.Test;

public class Hot1143Test {
    private final Hot1143 hot1143 = new Hot1143();

    @Test
    public void test1() {
        System.out.println(hot1143.longestCommonSubsequence("abcde", "ace"));
    }

    @Test
    public void test2() {
        System.out.println(hot1143.longestCommonSubsequence("abc", "abc"));
    }

    @Test
    public void test3() {
        System.out.println(hot1143.longestCommonSubsequence("abc", "def"));
    }

    @Test
    public void test4() {
        System.out.println(hot1143.longestCommonSubsequence("bsbininm", "jmjkbkjkv"));
    }
}
