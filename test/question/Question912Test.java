package question;

import org.junit.Test;

import java.util.Arrays;

public class Question912Test {
    private final Question912 question912 = new Question912();

    @Test
    public void test1() {
        System.out.println(Arrays.toString(question912.sortArray(new int[]{5, 2, 3, 1})));
    }

    @Test
    public void test2() {
        System.out.println(Arrays.toString(question912.sortArray(new int[]{5, 1, 1, 2, 0, 0})));
    }

    @Test
    public void test3() {
        System.out.println(Arrays.toString(question912.sortArray(new int[]{0, 0})));
    }

    @Test
    public void test4() {
        System.out.println(Arrays.toString(question912.sortArray(new int[]{0, 0, 0})));
    }
}
