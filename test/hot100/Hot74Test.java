package hot100;

import org.junit.Test;

public class Hot74Test {
    @Test
    public void Test1() {
        Hot74 hot74 = new Hot74();
        System.out.println(hot74.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 3));
        System.out.println(hot74.searchMatrix(new int[][]{{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}}, 13));
        System.out.println(hot74.searchMatrix(new int[][]{{1}}, 1));
        System.out.println(hot74.searchMatrix(new int[][]{{1}}, 3));
        System.out.println(hot74.searchMatrix(new int[][]{{1}, {2}}, 3));
        System.out.println(hot74.searchMatrix(new int[][]{{1}, {2}}, 2));
    }

}
