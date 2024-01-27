package question;

import org.junit.Test;

public class Question5Test {
    private final Question5 question5 = new Question5();

    @Test
    public void test1() {
        System.out.println(question5.longestPalindrome("babad"));
    }

    @Test
    public void test2() {
        System.out.println(question5.longestPalindrome("cbbd"));
    }

    @Test
    public void test3() {
        System.out.println(question5.longestPalindrome("b"));
    }

    @Test
    public void test4() {
        System.out.println(question5.longestPalindrome("cccc"));
    }
}
