package question;

import org.junit.Test;

public class Question674Test {
    private final Question674 question674 = new Question674();

    @Test
    public void test1() {
        System.out.println(question674.findLengthOfLCIS(new int[]{1, 3, 5, 4, 7}));
    }

    @Test
    public void test2() {
        System.out.println(question674.findLengthOfLCIS(new int[]{2, 2, 2, 2, 2}));
    }
}
