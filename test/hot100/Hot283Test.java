package hot100;

import org.junit.Test;

import java.util.Arrays;

public class Hot283Test {
    private final Hot283 hot283 = new Hot283();

    @Test
    public void test1() {
        int[] nums = {0, 1, 0, 3, 12};
        hot283.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void test2() {
        int[] nums = {0};
        hot283.moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }
}
