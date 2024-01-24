package question;

import org.junit.Test;

public class Question3Test {
    private final Question3 question3 = new Question3();

    @Test
    public void test1() {
        System.out.println(question3.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void test2() {
        System.out.println(question3.lengthOfLongestSubstring("abba"));
    }

    @Test
    public void test3() {
        System.out.println(question3.lengthOfLongestSubstring("au"));
    }
}
