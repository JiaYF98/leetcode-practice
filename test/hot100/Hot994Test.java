package hot100;

import org.junit.Test;

public class Hot994Test {
    private final Hot994 hot994 = new Hot994();

    @Test
    public void test1() {
        int[][] grid = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        System.out.println(hot994.orangesRotting(grid));
    }

    @Test
    public void test2() {
        int[][] grid = {{0, 2}};
        System.out.println(hot994.orangesRotting(grid));
    }

    @Test
    public void test3() {
        int[][] grid = {{2, 2}, {1, 1}, {0, 0}, {2, 0}};
        System.out.println(hot994.orangesRotting(grid));
    }
}
