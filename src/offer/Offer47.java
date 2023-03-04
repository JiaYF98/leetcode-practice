package offer;

public class Offer47 {
    public int maxValue(int[][] grid) {
        int rowLength = grid.length;
        int columnLength = grid[0].length;

        int[][] max = new int[rowLength + 2][columnLength + 2];

        for (int i = 1; i <= rowLength; i++) {
            for (int j = 1; j <= columnLength; j++) {
                max[i][j] = grid[i - 1][j - 1] + Math.max(max[i - 1][j], max[i][j - 1]);
            }
        }

        return max[rowLength][columnLength];
    }

    // 递归调用 超时
//    public int maxValue(int[][] grid) {
//        return recursion(grid, 0, 0);
//    }
//
//    private int recursion(int[][] grid, int i, int j) {
//        if (i == grid.length || j == grid[0].length) {
//            return 0;
//        }
//
//        return grid[i][j] + Math.max(recursion(grid, i + 1, j), recursion(grid, i, j + 1));
//    }
}
