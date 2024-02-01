package question;

import org.junit.Test;

public class Question718Test {
    private final Question718 question718 = new Question718();

    @Test
    public void test1() {
        System.out.println(question718.findLength(new int[]{1, 2, 3, 2, 1}, new int[]{3, 2, 1, 4, 7}));
    }

    @Test
    public void test2() {
        System.out.println(question718.findLength(new int[]{0, 0, 0, 0, 0}, new int[]{0, 0, 0, 0, 0}));
    }
}
