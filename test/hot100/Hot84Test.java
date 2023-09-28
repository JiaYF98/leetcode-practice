package hot100;

import org.junit.Test;

public class Hot84Test {
    private final Hot84 hot84 = new Hot84();

    @Test
    public void test1() {
        System.out.println(hot84.largestRectangleArea(new int[]{2, 1, 5, 6, 2, 3}));
    }

    @Test
    public void test2() {
        System.out.println(hot84.largestRectangleArea(new int[]{2, 4}));
    }
}
