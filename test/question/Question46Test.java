package question;

import org.junit.Test;

public class Question46Test {
    private final Question46 question46 = new Question46();

    @Test
    public void test1() {
        System.out.println(question46.permute(new int[]{1, 2, 3}));
    }

    @Test
    public void test2() {
        System.out.println(question46.permute(new int[]{0, 1}));
    }

    @Test
    public void test3() {
        System.out.println(question46.permute(new int[]{1}));
    }
}
