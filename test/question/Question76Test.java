package question;

import org.junit.Test;

public class Question76Test {
    private final Question76 question76 = new Question76();

    @Test
    public void test1() {
        System.out.println(question76.minWindow("ADOBECODEBANC", "ABC"));
    }

    @Test
    public void test2() {
        System.out.println(question76.minWindow("AabaA", "aba"));
    }

    @Test
    public void test3() {
        System.out.println(question76.minWindow("aa", "aa"));
    }

    @Test
    public void test4() {
        System.out.println(question76.minWindow("ab", "A"));
    }

    @Test
    public void test5() {
        System.out.println(question76.minWindow("A", "A"));
    }

    @Test
    public void test6() {
        System.out.println(question76.minWindow("adobecodebanc", "abcda"));
    }
}
