package question;

import org.junit.Test;

public class Question62Test {
    private final Question62 question62 = new Question62();

    @Test
    public void test1() {
        System.out.println(question62.uniquePaths(3, 7));
    }

    @Test
    public void test2() {
        System.out.println(question62.uniquePaths(3, 2));
    }
}
