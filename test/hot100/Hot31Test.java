package hot100;

import org.junit.Test;

import java.util.Arrays;

public class Hot31Test {
    @Test
    public void Test1() {
        Hot31 hot31 = new Hot31();
        int[] nums = new int[]{1, 2, 3};
        hot31.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void Test2() {
        Hot31 hot31 = new Hot31();
        int[] nums = new int[]{1, 3, 2};
        hot31.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void Test3() {
        Hot31 hot31 = new Hot31();
        int[] nums = new int[]{1, 3, 4, 5, 8, 6, 2};
        hot31.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void Test4() {
        Hot31 hot31 = new Hot31();
        int[] nums = new int[]{1, 67, 0};
        hot31.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void Test5() {
        Hot31 hot31 = new Hot31();
        int[] nums = new int[]{1, 2, 4, 3, 5, 7, 1, 2, 3, 2, 3, 1};
        hot31.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void Test6() {
        Hot31 hot31 = new Hot31();
        int[] nums = new int[]{5, 67, 4, 4, 3, 2, 1};
        hot31.nextPermutation(nums);
        System.out.println(Arrays.toString(nums));
    }
}
