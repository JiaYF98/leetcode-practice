package hot100;

import org.junit.Assert;
import org.junit.Test;

public class Hot121Test {
    private final Hot121 hot121 = new Hot121();

    @Test
    public void test1() {
        Assert.assertEquals(5, hot121.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        Assert.assertEquals(0, hot121.maxProfit(new int[]{7, 6, 4, 3, 1}));
        Assert.assertEquals(0, hot121.maxProfit(new int[]{7}));
    }
}
