package question;

import org.junit.Test;

public class Question15Test {
    private final Question15 question15 = new Question15();

    @Test
    public void test1() {
        System.out.println(question15.threeSum(new int[]{-1, 0, 1, 2, -1, -4}));
    }

    @Test
    public void test2() {
        System.out.println(question15.threeSum(new int[]{0, 1, 1}));
    }

    @Test
    public void test3() {
        System.out.println(question15.threeSum(new int[]{0, 0, 0}));
    }

}
