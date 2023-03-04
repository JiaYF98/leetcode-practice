package offer;

import org.junit.Test;

public class Offer63Test {
    @Test
    public void Test1() {
        Offer63 offer63 = new Offer63();
        System.out.println(offer63.maxProfit(new int[]{7, 1, 5, 3, 6, 4}));
        System.out.println(offer63.maxProfit(new int[]{7, 6, 4, 3, 1}));
        System.out.println(offer63.maxProfit(new int[]{1, 2, 3, 4, 5, 6}));
    }
}
