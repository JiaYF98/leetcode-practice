package offer;

import org.junit.Test;

public class Offer65Test {
    @Test
    public void Test1() {
        Offer65 offer65 = new Offer65();
        System.out.println(offer65.add(1, 1));
        System.out.println(offer65.add(1, 0));
        System.out.println(offer65.add(0, 1));
        System.out.println(offer65.add(0, 0));
        System.out.println(offer65.add(-3, -1));
        System.out.println(offer65.add(-3, 5));
    }
}
