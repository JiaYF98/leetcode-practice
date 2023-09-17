package hot100;

import org.junit.Test;

public class Hot207Test {
    private final Hot207 hot207 = new Hot207();

    @Test
    public void test1() {
        System.out.println(hot207.canFinish(2, new int[][]{{1, 0}}));
    }

    @Test
    public void test2() {
        System.out.println(hot207.canFinish(2, new int[][]{{1, 0}, {0, 1}}));
    }
}
