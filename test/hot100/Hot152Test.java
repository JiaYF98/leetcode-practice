package hot100;

import org.junit.Test;

import java.util.Random;

public class Hot152Test {
    private final Hot152 hot152 = new Hot152();

    @Test
    public void test1() {
        System.out.println(hot152.maxProduct(new int[]{2, 3, -2, 4}));
    }

    @Test
    public void test2() {
        System.out.println(hot152.maxProduct(new int[]{-2, 0, -1}));
    }

    @Test
    public void test3() {
        System.out.println(hot152.maxProduct(new int[]{1}));
    }

    @Test
    public void test4() {
        System.out.println(hot152.maxProduct(new int[]{1, -2, 1, 2, 2, 3, 4, 5}));
    }

    @Test
    public void test5() {
        System.out.println(hot152.maxProduct(new int[]{-1, -2, -3}));
    }

    @Test
    public void test6() {
        System.out.println(hot152.maxProduct(new int[]{-1, -2, 0, -1, -3}));
    }

    @Test
    public void test7() {
        System.out.println(hot152.maxProduct(new int[]{-1, 2, -3, 0, 4, 0, -5, 7, 0}));
    }

    @Test
    public void test8() {
        System.out.println(hot152.maxProduct(new int[]{-1, 2, -3, 0, 0, 4, 0, -5, 7, 0}));
    }

    @Test
    public void test9() {
//        for (int i = 0; i < 20000; i++) {
//            System.out.print((int) ((Math.random() - 0.5) * 10) + ",");
//        }
    }
}
