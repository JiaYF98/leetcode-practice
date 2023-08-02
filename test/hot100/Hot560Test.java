package hot100;

import org.junit.Test;

public class Hot560Test {
    private final Hot560 hot560 = new Hot560();

    @Test
    public void test1() {
        System.out.println(hot560.subarraySum(new int[]{1, 1, 1}, 2));
        System.out.println(hot560.subarraySum(new int[]{1, 2, 3}, 3));
    }
}
