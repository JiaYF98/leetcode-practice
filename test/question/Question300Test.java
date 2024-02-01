package question;

import org.junit.Test;

public class Question300Test {
    private final Question300 question300 = new Question300();

    @Test
    public void test1() {
        System.out.println(question300.lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18}));
    }

    @Test
    public void test2() {
        System.out.println(question300.lengthOfLIS(new int[]{0, 1, 0, 3, 2, 3}));
    }

    @Test
    public void test3() {
        System.out.println(question300.lengthOfLIS(new int[]{7, 7, 7, 7, 7, 7, 7}));
    }
}
