package hot100;

import org.junit.Test;

import java.util.Arrays;

public class Hot239Test {
    private final Hot239 hot239 = new Hot239();

    @Test
    public void test1() {
        System.out.println(Arrays.toString(hot239.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3)));
        System.out.println(Arrays.toString(hot239.maxSlidingWindow(new int[]{1}, 1)));
        System.out.println(Arrays.toString(hot239.maxSlidingWindow(new int[]{1, 0, 0, 0, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, 10)));
        System.out.println(Arrays.toString(hot239.maxSlidingWindow(new int[]{1, 3, 1, 2, 0, 5}, 3)));
    }
}
