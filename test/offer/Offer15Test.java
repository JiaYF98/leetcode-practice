package offer;

import org.junit.Test;

public class Offer15Test {
    @Test
    public void Test1() {
        Offer15 offer15 = new Offer15();
        System.out.println(offer15.hammingWeight(11));
        System.out.println(offer15.hammingWeight(128));
        System.out.println(offer15.hammingWeight(-3));
    }
}
