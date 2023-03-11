package offer;

import org.junit.Test;

public class Offer41Test {
    @Test
    public void Test1() {
        Offer41 offer41 = new Offer41();
        offer41.addNumber(1);
        offer41.addNumber(2);
        System.out.println(offer41.findMedian());
        offer41.addNumber(3);
        System.out.println(offer41.findMedian());
    }
}
