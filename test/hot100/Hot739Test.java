package hot100;

import org.junit.Test;

import java.util.Arrays;

public class Hot739Test {
    private final Hot739 hot739 = new Hot739();

    @Test
    public void test1() {
        System.out.println("hot739.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73}) = "
                + Arrays.toString(hot739.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));

        System.out.println("hot739.dailyTemperatures(new int[]{30, 40, 50, 60}) = "
                + Arrays.toString(hot739.dailyTemperatures(new int[]{30, 40, 50, 60})));

        System.out.println("hot739.dailyTemperatures(new int[]{30, 60, 90}) = "
                + Arrays.toString(hot739.dailyTemperatures(new int[]{30, 60, 90})));
    }
}
