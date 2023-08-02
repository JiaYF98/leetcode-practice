package hot100;

import org.junit.Test;

public class Hot78Test {
    private final Hot78 hot78 = new Hot78();

    @Test
    public void test1() {
        System.out.println("hot78.subsets(new int[]{1, 2, 3}) = " + hot78.subsets(new int[]{1, 2, 3}));
        System.out.println("hot78.subsets(new int[]{0}) = " + hot78.subsets(new int[]{0}));
        System.out.println(hot78.subsets(new int[]{}));
    }
}
