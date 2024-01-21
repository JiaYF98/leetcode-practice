package interview;

import org.junit.Test;

public class Interview123Test {
    private final Interview123 interview123 = new Interview123();

    @Test
    public void test1() {
        System.out.println(interview123.maxProfit(new int[]{3, 3, 5, 0, 0, 3, 1, 4}));
    }

    @Test
    public void test2() {
        System.out.println(interview123.maxProfit(new int[]{1, 2, 3, 4, 5}));
    }

    @Test
    public void test3() {
        System.out.println(interview123.maxProfit(new int[]{7, 6, 4, 3, 1}));
    }

    @Test
    public void test4() {
        System.out.println(interview123.maxProfit(new int[]{1}));
    }

    @Test
    public void test5() {
        System.out.println(interview123.maxProfit(new int[]{1, 2, 4, 2, 5, 7, 2, 4, 9, 0}));
    }
}
