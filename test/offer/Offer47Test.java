package offer;

import org.junit.Test;

import java.util.Random;

public class Offer47Test {

    @Test
    public void Test1() {
        Offer47 offer47 = new Offer47();
        System.out.println(offer47.maxValue(new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}}));
        System.out.println(offer47.maxValue(new int[][]{{1}}));
    }
}
