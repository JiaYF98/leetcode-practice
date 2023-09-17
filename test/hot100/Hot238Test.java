package hot100;

import org.junit.Test;

import java.util.Arrays;

public class Hot238Test {
    private final Hot238 hot238 = new Hot238();

    @Test
    public void test1() {
        System.out.println(Arrays.toString(hot238.productExceptSelf(new int[]{1, 2, 3, 4})));
    }

    @Test
    public void test2() {
        System.out.println(Arrays.toString(hot238.productExceptSelf(new int[]{-1, 1, 0, -3, 3})));
    }
}
