package hot100;

public class Hot62 {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 2][n + 2];
        dp[0][1] = 1;

        for (int i = 1; i < m + 1; i++) {
            for (int j = 1; j < n + 1; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return dp[m][n];
    }
}
