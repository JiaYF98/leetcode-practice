package hot100;

import org.junit.Test;

public class Hot45Test {
    private final Hot45 hot45 = new Hot45();

    @Test
    public void test1() {
        System.out.println("hot45.jump(new int[]{2, 3, 1, 1, 4}) = " + hot45.jump(new int[]{2, 3, 1, 1, 4}));
        System.out.println("hot45.jump(new int[]{0}) = " + hot45.jump(new int[]{0}));
        System.out.println("hot45.jump(new int[]{1, 2}) = " + hot45.jump(new int[]{1, 2}));
        System.out.println("hot45.jump(new int[]{2, 1}) = " + hot45.jump(new int[]{2, 1}));
        System.out.println("hot45.jump(new int[]{7, 0, 9, 6, 9, 6, 1, 7, 9, 0, 1, 2, 9, 0, 3}) = " + hot45.jump2(new int[]{7, 0, 9, 6, 9, 6, 1, 7, 9, 0, 1, 2, 9, 0, 3}));
    }
}
