package hot100;

import org.junit.Test;

import java.util.Arrays;

public class Hot56Test {
    private final Hot56 hot56 = new Hot56();

    @Test
    public void test1() {
        System.out.println(Arrays.deepToString(hot56.merge(new int[][]{{1, 3}, {2, 6}, {8, 10}, {15, 18}})));
        System.out.println(Arrays.deepToString(hot56.merge(new int[][]{{1, 4}, {4, 5}})));
    }
}
