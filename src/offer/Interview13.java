package offer;

public class Interview13 {
    private boolean isVisit(int i, int j, int m, int n, int k) {
        if (i < 0 || j < 0 || i >= m || j >= n)
            return false;

        int sum = 0;
        while (i != 0) {
            sum += i % 10;
            i /= 10;
        }

        while (j != 0) {
            sum += j % 10;
            j /= 10;
        }

        return sum <= k;
    }

    private void dfs(boolean[][] visited, int i, int j, int k) {
        if (isVisit(i, j, visited.length, visited[0].length, k) && !visited[i][j]) {
            visited[i][j] = true;
            int[][] directions = {{0, 1}, {1, 0}};
            for (int[] dir : directions) {
                int newi = i + dir[0];
                int newj = j + dir[1];
                dfs(visited, newi, newj, k);
            }
        }
    }

    public int movingCount(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];

        dfs(visited, 0, 0, k);

        int result = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (visited[i][j]) {
                    result++;
                }
            }
        }

        return result;
    }

    /*
    评论思路
     */
    public int movingCount2(int m, int n, int k) {
        boolean[][] visited = new boolean[m][n];
        return dfs(0, 0, m, n, k, visited);
    }

    private int dfs(int i, int j, int m, int n, int k, boolean visited[][]) {
        if (i < 0 || i >= m || j < 0 || j >= n || (i/10 + i%10 + j/10 + j%10) > k || visited[i][j]) {
            return 0;
        }
        visited[i][j] = true;
        return dfs(i + 1, j, m, n, k, visited) + dfs(i - 1, j, m, n, k, visited) +
                dfs(i, j + 1, m, n, k, visited) + dfs(i, j - 1, m, n, k, visited) + 1;
    }
}
