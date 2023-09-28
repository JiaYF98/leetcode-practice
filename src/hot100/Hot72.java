package hot100;

public class Hot72 {
    public int minDistance(String word1, String word2) {
        char[] word1CharArray = word1.toCharArray();
        char[] word2CharArray = word2.toCharArray();

        int m = word1CharArray.length;
        int n = word2CharArray.length;

        int[][] dp = new int[m + 1][n + 1];

        for (int j = 1; j <= n; j++) {
            dp[0][j] = j;
        }

        for (int i = 1; i <= m; i++) {
            dp[i][0] = i;
        }

        for (int j = 1; j <= n; j++) {
            for (int i = 1; i <= m; i++) {
                char c1 = word1CharArray[i - 1];
                char c2 = word2CharArray[j - 1];

                if (c1 == c2) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.min(Math.min(dp[i - 1][j - 1], dp[i - 1][j]), dp[i][j - 1]) + 1;
                }
            }
        }

        return dp[m][n];
    }
}
