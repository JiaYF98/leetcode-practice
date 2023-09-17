package hot100;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Hot139Test {
    private final Hot139 hot139 = new Hot139();

    @Test
    public void test1() {
        System.out.println(hot139.wordBreak("leetcode", Arrays.asList("leet", "code")));
    }

    @Test
    public void test2() {
        System.out.println(hot139.wordBreak("applepenapple", Arrays.asList("apple", "pen")));
    }

    @Test
    public void test3() {
        System.out.println(hot139.wordBreak("applepenapple", Arrays.asList("applep", "en")));
    }

    @Test
    public void test4() {
        System.out.println(hot139.wordBreak("catsandog", Arrays.asList("cats", "dog", "sand", "and", "cat")));
    }

    @Test
    public void test5() {
        System.out.println(hot139.wordBreak("sssssss", List.of("s")));
    }

    @Test
    public void test6() {
        System.out.println(hot139.wordBreak("aaaab",
                Arrays.asList("a", "aa", "aaa")));
    }
}
