package hot100;

import org.junit.Test;

public class Hot54Test {
    private final Hot54 hot54 = new Hot54();

    @Test
    public void test1() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println(hot54.spiralOrder(matrix));
    }

    @Test
    public void test2() {
        int[][] matrix = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        System.out.println(hot54.spiralOrder(matrix));
    }

    @Test
    public void test3() {
        int[][] matrix = {{1}};
        System.out.println(hot54.spiralOrder(matrix));
    }
}
