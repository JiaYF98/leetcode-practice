package interview;

import org.junit.Assert;
import org.junit.Test;

public class Interview274Test {
    Interview274 interview274 = new Interview274();

    @Test
    public void test1() {
        Assert.assertEquals(3, interview274.hIndex(new int[]{3, 0, 6, 1, 5}));
    }

    @Test
    public void test2() {
        Assert.assertEquals(1, interview274.hIndex(new int[]{1, 3, 1}));
    }

    @Test
    public void test3() {
        Assert.assertEquals(1, interview274.hIndex(new int[]{1}));
    }

    @Test
    public void test4() {
        Assert.assertEquals(0, interview274.hIndex(new int[]{0}));
    }
}
