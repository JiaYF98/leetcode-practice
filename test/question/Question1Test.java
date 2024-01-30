package question;

import org.junit.Test;

import java.util.Arrays;

public class Question1Test {
    private final Question1 question1 = new Question1();

    @Test
    public void test1() {
        System.out.println(Arrays.toString(question1.twoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    @Test
    public void test2() {
        System.out.println(Arrays.toString(question1.twoSum(new int[]{3, 2, 4}, 6)));
    }

    @Test
    public void test3() {
        System.out.println(Arrays.toString(question1.twoSum(new int[]{3, 3}, 6)));
    }

    @Test
    public void test4() {
        System.out.println(Arrays.toString(question1.twoSum(new int[]{3, 2, 3}, 6)));
    }
}
