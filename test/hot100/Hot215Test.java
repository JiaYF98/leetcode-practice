package hot100;

import org.junit.Test;

public class Hot215Test {
    private final Hot215 hot215 = new Hot215();

    @Test
    public void test1() {
        System.out.println(hot215.findKthLargest(new int[]{3, 2, 1, 5, 6, 4}, 2));
    }

    @Test
    public void test2() {
        System.out.println(hot215.findKthLargest(new int[]{3, 2, 3, 1, 2, 4, 5, 5, 6}, 4));
    }
}
