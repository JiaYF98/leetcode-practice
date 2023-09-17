package hot100;

import org.junit.Test;

public class Hot300Test {
    private final Hot300 hot300 = new Hot300();

    @Test
    public void test1() {
        int[] nums = {10, 9, 2, 5, 3, 7, 101, 18};
        System.out.println(hot300.lengthOfLIS2(nums));
    }

    @Test
    public void test2() {
        int[] nums = {0, 1, 0, 3, 2, 3};
        System.out.println(hot300.lengthOfLIS2(nums));
    }

    @Test
    public void test3() {
        int[] nums = {7, 7, 7, 7, 7, 7, 7};
        System.out.println(hot300.lengthOfLIS2(nums));
    }
}