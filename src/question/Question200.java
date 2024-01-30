package question;

public class Question200 {
    public int numIslands(char[][] grid) {
        int row = grid.length;
        int column = grid[0].length;

        int islandsNumber = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] == '1') {
                    islandsNumber++;
                    dfs(grid, i, j);
                }
            }
        }

        return islandsNumber;
    }

    private void dfs(char[][] grid, int i, int j) {
        grid[i][j] = '0';
        // 右面
        if (i < grid.length - 1 && grid[i + 1][j] == '1') {
            dfs(grid, i + 1, j);
        }

        // 下面
        if (j < grid[0].length - 1 && grid[i][j + 1] == '1') {
            dfs(grid, i, j + 1);
        }

        // 左面
        if (i > 0 && grid[i - 1][j] == '1') {
            dfs(grid, i - 1, j);
        }

        // 上面
        if (j > 0 && grid[i][j - 1] == '1') {
            dfs(grid, i, j - 1);
        }
    }
}
