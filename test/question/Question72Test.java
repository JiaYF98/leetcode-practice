package question;

import org.junit.Test;

public class Question72Test {
    private final Question72 question72 = new Question72();

    @Test
    public void test1() {
        System.out.println(question72.minDistance("horse", "ros"));
    }

    @Test
    public void test2() {
        System.out.println(question72.minDistance("intention", "execution"));
    }
}
