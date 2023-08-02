package hot100;

import org.junit.Test;

public class Hot204Test {
    private final Hot204 hot204 = new Hot204();

    @Test
    public void test1() {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println(hot204.searchMatrix(matrix, 5));
    }

    @Test
    public void test2() {
        int[][] matrix = {{1, 4, 7, 11, 15}, {2, 5, 8, 12, 19}, {3, 6, 9, 16, 22}, {10, 13, 14, 17, 24}, {18, 21, 23, 26, 30}};
        System.out.println(hot204.searchMatrix(matrix, 20));
    }
}
