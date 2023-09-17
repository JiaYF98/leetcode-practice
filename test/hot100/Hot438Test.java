package hot100;

import org.junit.Test;

public class Hot438Test {
    private final Hot438 hot438 = new Hot438();

    @Test
    public void test1() {
        System.out.println(hot438.findAnagrams("cbaebabacd", "abc"));
    }

    @Test
    public void test2() {
        System.out.println(hot438.findAnagrams("aabaaab", "aab"));
    }

    @Test
    public void test3() {
        System.out.println(hot438.findAnagrams("abab", "ab"));
    }
}
