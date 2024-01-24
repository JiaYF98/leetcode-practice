package question;

import org.junit.Test;

public class Question215Test {
    private final Question215 question215 = new Question215();

    @Test
    public void test1() {
        System.out.println(question215.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    public void test2() {
        System.out.println(question215.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}
