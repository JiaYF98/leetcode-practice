package question;

import org.junit.Test;

public class Question78Test {
    private final Question78 question78 = new Question78();

    @Test
    public void test1() {
        System.out.println(question78.subsets(new int[]{1, 2, 3}));
    }

    @Test
    public void test2() {
        System.out.println(question78.subsets(new int[]{0}));
    }
}
