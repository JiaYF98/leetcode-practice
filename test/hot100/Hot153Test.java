package hot100;

import org.junit.Test;

public class Hot153Test {
    private final Hot153 hot153 = new Hot153();

    @Test
    public void test1() {
        System.out.println(hot153.findMin(new int[]{3, 4, 5, 1, 2}));
    }

    @Test
    public void test2() {
        System.out.println(hot153.findMin(new int[]{4, 5, 6, 7, 0, 1, 2}));
    }

    @Test
    public void test3() {
        System.out.println(hot153.findMin(new int[]{11, 13, 15, 17}));
    }

    @Test
    public void test4() {
        System.out.println(hot153.findMin(new int[]{1}));
    }

    @Test
    public void test5() {
        System.out.println(hot153.findMin(new int[]{1, 2, 3, 4, 5, 6}));
    }

    @Test
    public void test6() {
        System.out.println(hot153.findMin(new int[]{7, 1, 2, 3, 4, 5, 6}));
    }
}
