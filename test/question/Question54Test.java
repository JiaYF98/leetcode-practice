package question;

import org.junit.Test;

public class Question54Test {
    private final Question54 question54 = new Question54();

    @Test
    public void test1() {
        System.out.println(question54.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
    }

    @Test
    public void test2() {
        System.out.println(question54.spiralOrder(new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}}));
    }

    @Test
    public void test3() {
        System.out.println(question54.spiralOrder(new int[][]{{1}, {2}, {3}}));
    }

    @Test
    public void test4() {
        System.out.println(question54.spiralOrder(new int[][]{{1, 2, 3}, {4, 5, 6}}));
    }
}
