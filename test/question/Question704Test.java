package question;

import org.junit.Test;

public class Question704Test {
    private final Question704 question704 = new Question704();

    @Test
    public void test1() {
        System.out.println(question704.search(new int[]{-1, 0, 3, 5, 9, 12}, 9));
    }

    @Test
    public void test2() {
        System.out.println(question704.search(new int[]{-1, 0, 3, 5, 9, 12}, 2));
    }
}
