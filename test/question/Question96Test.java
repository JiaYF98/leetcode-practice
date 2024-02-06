package question;

import org.junit.Test;

public class Question96Test {
    private final Question96 question96 = new Question96();

    @Test
    public void test1() {
        System.out.println(question96.numTrees(1));
    }
    @Test
    public void test2() {
        System.out.println(question96.numTrees(2));
    }
    @Test
    public void test3() {
        System.out.println(question96.numTrees(3));
    }
    @Test
    public void test4() {
        System.out.println(question96.numTrees(19));
    }
}
