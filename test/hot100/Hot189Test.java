package hot100;

import org.junit.Test;

import java.util.Arrays;

public class Hot189Test {
    private final Hot189 hot189 = new Hot189();

    @Test
    public void test1() {
        int[] nums = {1, 2, 3, 4, 5, 6, 7};
        hot189.rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void test2() {
        int[] nums = {-1, -100, 3, 99};
        hot189.rotate(nums, 2);
        System.out.println(Arrays.toString(nums));
    }
}
