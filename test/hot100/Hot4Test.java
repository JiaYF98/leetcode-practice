package hot100;

import org.junit.Test;

public class Hot4Test {
    private final Hot4 hot4 = new Hot4();

    @Test
    public void test1() {
        System.out.println(hot4.findMedianSortedArrays(new int[]{1, 3}, new int[]{2}));
        System.out.println(hot4.findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4}));
    }
}
