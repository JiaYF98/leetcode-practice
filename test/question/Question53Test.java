package question;

import org.junit.Test;

public class Question53Test {
    private final Question53 question53 = new Question53();

    @Test
    public void test1() {
        System.out.println(question53.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }

    @Test
    public void test2() {
        System.out.println(question53.maxSubArray(new int[]{1}));
    }

    @Test
    public void test3() {
        System.out.println(question53.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}
