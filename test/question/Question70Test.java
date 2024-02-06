package question;

import org.junit.Test;

public class Question70Test {
    private final Question70 question70 = new Question70();

    @Test
    public void test1() {
        System.out.println(question70.climbStairs(3));
    }

    @Test
    public void test2() {
        System.out.println(question70.climbStairs(30));
    }

    @Test
    public void test3() {
        System.out.println(question70.climbStairs(33));
    }
}
