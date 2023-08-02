package hot100;

import org.junit.Test;

public class Hot200Test {
    private final Hot200 hot200 = new Hot200();

    @Test
    public void test1() {
        char[][] grid = new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        };
        System.out.println(hot200.numIslands(grid));
    }

    @Test
    public void test2() {
        char[][] grid = new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };
        System.out.println(hot200.numIslands(grid));
    }

    @Test
    public void test3() {
        char[][] grid = new char[][]{
                {'1'}
        };
        System.out.println(hot200.numIslands(grid));
    }

    @Test
    public void test4() {
        char[][] grid = new char[][]{
                {'0'}
        };
        System.out.println(hot200.numIslands(grid));
    }

    @Test
    public void test5() {
        char[][] grid = new char[][]{
                {'1', '1', '0', '0'},
                {'1', '1', '0', '0'},
                {'0', '0', '1', '0'},
                {'0', '0', '0', '1'}
        };
        System.out.println(hot200.numIslands(grid));
    }

    @Test
    public void test6() {
        char[][] grid = new char[][]{
                {'1', '1', '1'},
                {'0', '1', '0'},
                {'1', '1', '1'}
        };
        System.out.println(hot200.numIslands(grid));
    }

    @Test
    public void test7() {
        char[][] grid = new char[][]{
                {'1', '0', '1', '1', '1'},
                {'1', '0', '1', '0', '1'},
                {'1', '1', '1', '0', '1'}
        };
        System.out.println(hot200.numIslands(grid));
    }
}
