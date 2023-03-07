package offer;

import org.junit.Test;

import java.util.Arrays;

public class Offer21Test {
    @Test
    public void Test1() {
        Offer21 offer21 = new Offer21();
        int[] exchange = offer21.exchange(new int[]{1, 2, 3, 4});
        System.out.println(Arrays.toString(exchange));
    }

    @Test
    public void Test2() {
        Offer21 offer21 = new Offer21();
        int[] exchange = offer21.exchange(new int[]{1, 3, 5, 7});
        System.out.println(Arrays.toString(exchange));
    }

    @Test
    public void Test3() {
        Offer21 offer21 = new Offer21();
        int[] exchange = offer21.exchange(new int[]{2, 2, 4, 4});
        System.out.println(Arrays.toString(exchange));
    }

    @Test
    public void Test4() {
        Offer21 offer21 = new Offer21();
        int[] exchange = offer21.exchange(new int[]{});
        System.out.println(Arrays.toString(exchange));
    }

    @Test
    public void Test5() {
        Offer21 offer21 = new Offer21();
        int[] exchange = offer21.exchange(new int[]{1});
        System.out.println(Arrays.toString(exchange));
    }
}
