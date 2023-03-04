package offer;

import org.junit.Test;

public class Offer42Test {
    @Test
    public void Test1() {
        Offer42 offer42 = new Offer42();
        System.out.println(offer42.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(offer42.maxSubArray(new int[]{-2, -1, -3, -4, -1, -2, -1, -5, -4}));
        System.out.println(offer42.maxSubArray(new int[]{-2, -1, -3, -4, -1, -2, 0, -5, -4}));
    }
}
