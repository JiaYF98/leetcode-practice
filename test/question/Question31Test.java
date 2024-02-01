package question;

import org.junit.Test;

import java.util.Arrays;

public class Question31Test {
    private final Question31 question31 = new Question31();

    @Test
    public void test1() {
        int[] nums = {1, 2, 3};
        question31.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void test2() {
        int[] nums = {3, 2, 1};
        question31.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void test3() {
        int[] nums = {1, 1, 5};
        question31.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
