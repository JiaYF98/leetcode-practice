package offer;

import org.junit.Test;

import java.util.Arrays;

public class Offer56ITest {
    @Test
    public void Test1() {
        Offer56I offer56I = new Offer56I();
        System.out.println(Arrays.toString(offer56I.singleNumbers(new int[]{1, 2, 10, 4, 1, 4, 3, 3})));
    }
}
