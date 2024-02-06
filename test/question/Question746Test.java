package question;

import org.junit.Test;

public class Question746Test {
    private final Question746 question746 = new Question746();

    @Test
    public void test1() {
        System.out.println(question746.minCostClimbingStairs(new int[]{10, 15, 20}));
    }

    @Test
    public void test2() {
        System.out.println(question746.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
