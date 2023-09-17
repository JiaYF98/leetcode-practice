package hot100;

import org.junit.Test;

public class Hot416Test {
    private final Hot416 hot416 = new Hot416();

    @Test
    public void test1() {
        System.out.println(hot416.canPartition(new int[]{1, 5, 11, 5}));
    }

    @Test
    public void test2() {
        System.out.println(hot416.canPartition(new int[]{1, 2, 3, 5}));
    }

    @Test
    public void test3() {
        System.out.println(hot416.canPartition(new int[]{2}));
    }
}
