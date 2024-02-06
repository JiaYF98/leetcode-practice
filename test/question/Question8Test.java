package question;

import org.junit.Test;

public class Question8Test {
    private final Question8 question8 = new Question8();

    @Test
    public void test1() {
        System.out.println(question8.myAtoi("42"));
    }

    @Test
    public void test2() {
        System.out.println(question8.myAtoi("   -42"));
    }

    @Test
    public void test3() {
        System.out.println(question8.myAtoi("4193 with words"));
    }

    @Test
    public void test4() {
        System.out.println(question8.myAtoi("-00004193 with words"));
    }

    @Test
    public void test5() {
        System.out.println(question8.myAtoi("words -00004193 with words"));
    }

    @Test
    public void test6() {
        System.out.println(question8.myAtoi(""));
    }
}
