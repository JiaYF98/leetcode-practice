package offer;

import org.junit.Test;

import java.util.Arrays;

public class Offer40Test {
    @Test
    public void Test1() {
        Offer40 offer40 = new Offer40();
        System.out.println(Arrays.toString(offer40.getLeastNumbers(new int[]{3, 2, 1}, 2)));
        System.out.println(Arrays.toString(offer40.getLeastNumbers(new int[]{0, 1, 2, 1}, 1)));
    }
}
