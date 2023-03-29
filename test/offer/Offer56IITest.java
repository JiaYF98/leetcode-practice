package offer;

import org.junit.Assert;
import org.junit.Test;

public class Offer56IITest {
    @Test
    public void Test1() {
        Offer56II offer56II = new Offer56II();
        Assert.assertEquals(1, offer56II.singleNumber(new int[]{9, 1, 7, 9, 7, 9, 7}));
        Assert.assertEquals(4, offer56II.singleNumber(new int[]{3, 4, 3, 3}));
    }
}
