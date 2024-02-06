package question;

import org.junit.Test;

public class Question20Test {
    private final Question20 question20 = new Question20();

    @Test
    public void test1() {
        System.out.println(question20.isValid("()"));
    }

    @Test
    public void test2() {
        System.out.println(question20.isValid("()[]{}"));
    }

    @Test
    public void test3() {
        System.out.println(question20.isValid("(]"));
    }

    @Test
    public void test4() {
        System.out.println(question20.isValid("([{}])"));
    }
}
