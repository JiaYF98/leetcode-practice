package question;

import org.junit.Test;

public class Question33Test {
    private final Question33 question33 = new Question33();

    @Test
    public void test1() {
        System.out.println(question33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
    }

    @Test
    public void test2() {
        System.out.println(question33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 3));
    }

    @Test
    public void test3() {
        System.out.println(question33.search(new int[]{1}, 0));
    }

    @Test
    public void test4() {
        System.out.println(question33.search(new int[]{1, 2, 3, 4}, 0));
    }

    @Test
    public void test5() {
        System.out.println(question33.search(new int[]{1, 2, 3, 4}, 1));
    }

    @Test
    public void test6() {
        System.out.println(question33.search(new int[]{1, 2, 3, 4}, 2));
    }

    @Test
    public void test7() {
        System.out.println(question33.search(new int[]{4, 5, 6, 7, 0}, 7));
    }

    @Test
    public void test8() {
        System.out.println(question33.search(new int[]{4, 5, 6, 7, 0, 1, 2, 3}, 2));
    }
}
