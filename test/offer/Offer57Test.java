package offer;

import org.junit.Test;

import java.util.Arrays;

public class Offer57Test {
    @Test
    public void Test1() {
        Offer57 offer57 = new Offer57();
        System.out.println(Arrays.toString(offer57.twoSum(new int[]{2, 7, 22, 25}, 9)));
        System.out.println(Arrays.toString(offer57.twoSum(new int[]{2, 7, 22, 25}, 10)));
        System.out.println(Arrays.toString(offer57.twoSum(new int[]{10,26,30,31,47,60}, 40)));
        System.out.println(Arrays.toString(offer57.twoSum(new int[]{10}, 40)));
        System.out.println(Arrays.toString(offer57.twoSum(new int[]{10}, 20)));
        System.out.println(Arrays.toString(offer57.twoSum(new int[]{10}, 20)));
    }
}
