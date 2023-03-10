package hot100;

import org.junit.Test;

import java.util.Arrays;

public class Hot34Test {
    @Test
    public void Test1() {
        Hot34 hot34 = new Hot34();
        System.out.println(Arrays.toString(hot34.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 8)));
        System.out.println(Arrays.toString(hot34.searchRange(new int[]{5, 7, 7, 8, 8, 10}, 6)));
        System.out.println(Arrays.toString(hot34.searchRange(new int[]{5, 5, 7, 7, 8, 8, 10}, 5)));
        System.out.println(Arrays.toString(hot34.searchRange(new int[]{}, 5)));
        System.out.println(Arrays.toString(hot34.searchRange(new int[]{6, 7, 8, 9, 10}, 5)));
        System.out.println(Arrays.toString(hot34.searchRange(new int[]{6, 7, 8, 9, 10, 10}, 10)));
        System.out.println(Arrays.toString(hot34.searchRange(new int[]{6, 7, 8, 9, 10, 10, 10}, 10)));
        System.out.println(Arrays.toString(hot34.searchRange(new int[]{6, 7, 8, 9, 10, 10, 10}, 11)));
        System.out.println(Arrays.toString(hot34.searchRange(new int[]{1}, 1)));
        System.out.println(Arrays.toString(hot34.searchRange(new int[]{1}, 0)));

    }
}
