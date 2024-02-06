package question;

import org.junit.Test;

import java.util.Arrays;

public class Question56Test {
    private final Question56 question56 = new Question56();

    @Test
    public void test1() {
        System.out.println(Arrays.deepToString(question56.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
    }

    @Test
    public void test2() {
        System.out.println(Arrays.deepToString(question56.merge(new int[][]{{1, 4}, {4, 5}})));
    }

    @Test
    public void test3() {
        System.out.println(Arrays.deepToString(question56.merge(new int[][]{{1, 3}, {0, 3}, {0, 10}, {3, 3}})));
    }
}
