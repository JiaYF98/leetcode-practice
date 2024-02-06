package question;

import org.junit.Test;

public class Question63Test {
    private final Question63 question63 = new Question63();

    @Test
    public void test1() {
        System.out.println(question63.uniquePathsWithObstacles(new int[][]{{0, 0, 0}, {0, 1, 0}, {0, 0, 0}}));
    }

    @Test
    public void test2() {
        System.out.println(question63.uniquePathsWithObstacles(new int[][]{{0, 1}, {0, 0}}));
    }

    @Test
    public void test3() {
        System.out.println(question63.uniquePathsWithObstacles(new int[][]{{1}, {0}}));
    }
}
