package question;

import org.junit.Test;

import java.util.Arrays;

public class Question88Test {
    private final Question88 question88 = new Question88();

    @Test
    public void test1() {
        int[] nums1 = new int[]{1, 2, 3, 0, 0, 0};
        int[] nums2 = new int[]{2, 5, 6};
        question88.merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    @Test
    public void test2() {
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        question88.merge(nums1, 1, nums2, 0);
        System.out.println(Arrays.toString(nums1));
    }

    @Test
    public void test3() {
        int[] nums1 = new int[]{0};
        int[] nums2 = new int[]{1};
        question88.merge(nums1, 0, nums2, 1);
        System.out.println(Arrays.toString(nums1));
    }
}
