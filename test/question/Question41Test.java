package question;

import org.junit.Test;

public class Question41Test {
    private final Question41 question41 = new Question41();

    @Test
    public void test1() {
        System.out.println(question41.firstMissingPositive(new int[]{1, 2, 0}));
    }

    @Test
    public void test2() {
        System.out.println(question41.firstMissingPositive(new int[]{3, 4, -1, 1}));
    }

    @Test
    public void test3() {
        System.out.println(question41.firstMissingPositive(new int[]{7, 8, 9, 11, 12}));
    }
}
