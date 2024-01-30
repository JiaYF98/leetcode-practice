package question;

import org.junit.Test;

import java.util.Random;

public class Question121Test {
    private final Question121 question121 = new Question121();

    @Test
    public void test1() {
        System.out.println(question121.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void test2() {
        System.out.println(question121.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    public void test3() {
        System.out.println(question121.maxProfit(new int[]{7, 6, 4, 3, 9}));
    }

    @Test
    public void test4() {
        Random random = new Random();
        System.out.print("[");
        for (int i = 0; i < 99999; i++) {
            System.out.print(random.nextInt(10001) + ",");
        }
        System.out.println(random.nextInt(10001) + "]");
    }

    @Test
    public void test5() {
        System.out.println(question121.maxProfit2(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void test6() {
        System.out.println(question121.maxProfit2(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    public void test7() {
        System.out.println(question121.maxProfit2(new int[]{7, 6, 4, 3, 9}));
    }

    @Test
    public void test8() {
        System.out.println(question121.maxProfit3(new int[]{7, 1, 5, 3, 6, 4}));
    }

    @Test
    public void test9() {
        System.out.println(question121.maxProfit3(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    public void test10() {
        System.out.println(question121.maxProfit3(new int[]{7, 6, 4, 3, 9}));
    }
}
