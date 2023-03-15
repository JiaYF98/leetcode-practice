package hot100;

import org.junit.Test;

import java.util.Arrays;

public class Hot75Test {
    @Test
    public void Test1() {
        Hot75 hot75 = new Hot75();
        int[] nums = new int[]{2, 0, 2, 1, 1, 0};
        hot75.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }

    @Test
    public void Test2() {
        Hot75 hot75 = new Hot75();
        int[] nums = new int[]{2,0,1};
        hot75.sortColors(nums);
        System.out.println(Arrays.toString(nums));
    }
}
