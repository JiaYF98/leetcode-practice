package question;

import org.junit.Test;

public class Question42Test {
    private final Question42 question42 = new Question42();

    @Test
    public void test1() {
        System.out.println(question42.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    @Test
    public void test2() {
        System.out.println(question42.trap(new int[]{4, 2, 0, 3, 2, 5}));
    }
}
