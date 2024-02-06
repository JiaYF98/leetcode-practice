package question;

import java.util.Arrays;

public class Question63 {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1) {
            return 0;
        }

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = obstacleGrid.clone();

        for (int j = 0; j < n; j++) {
            if (dp[0][j] == 1) {
                Arrays.fill(obstacleGrid[0], j, n, 0);
                break;
            }
            dp[0][j] = 1;
        }

        for (int i = 1; i < m; i++) {
            if (dp[i][0] == 1) {
                for (int k = i; k < m; k++) {
                    dp[k][0] = 0;
                }
                break;
            }
            dp[i][0] = 1;
        }

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (dp[i][j] == 1) {
                    dp[i][j] = 0;
                } else {
                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
                }
            }
        }

        return dp[m - 1][n - 1];
    }
}
