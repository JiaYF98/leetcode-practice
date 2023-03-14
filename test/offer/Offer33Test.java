package offer;

import org.junit.Test;

public class Offer33Test {
    @Test
    public void Test1() {
        Offer33 offer33 = new Offer33();
        System.out.println(offer33.verifyPostorder(new int[]{1, 6, 3, 2, 5}));
        System.out.println(offer33.verifyPostorder(new int[]{1, 3, 2, 6, 5}));
        System.out.println(offer33.verifyPostorder(new int[]{}));
        System.out.println(offer33.verifyPostorder(new int[]{1}));
    }
}
