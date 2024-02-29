package question;

import org.junit.Test;

public class Question1143Test {
    private final Question1143 question1143 = new Question1143();

    @Test
    public void test1() {
        System.out.println(question1143.longestCommonSubsequence("abcde", "ace"));
    }
    @Test
    public void test2() {
        System.out.println(question1143.longestCommonSubsequence("abc", "abc"));
    }
    @Test
    public void test3() {
        System.out.println(question1143.longestCommonSubsequence("abc", "def"));
    }
}
