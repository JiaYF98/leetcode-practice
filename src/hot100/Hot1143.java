package hot100;

import java.util.Arrays;

public class Hot1143 {
    public int longestCommonSubsequence(String text1, String text2) {
        char[] charArray1 = text1.toCharArray();
        char[] charArray2 = text2.toCharArray();

        int ans = 0;
        int[][] dp = new int[charArray2.length][charArray1.length];

        // 设置第一行的值
        for (int i = 0; i < charArray1.length; i++) {
            if (charArray1[i] == charArray2[0]) {
                Arrays.fill(dp[0], i, dp[0].length, 1);
                ans = 1;
                break;
            }
        }

        // 设置第一列的值
        for (int i = 0; i < charArray2.length; i++) {
            if (charArray2[i] == charArray1[0]) {
                for (int j = i; j < charArray2.length; j++) {
                    dp[j][0] = 1;
                }
                ans = 1;
                break;
            }
        }

        for (int j = 1; j < charArray1.length; j++) {
            for (int i = 1; i < charArray2.length; i++) {
                if (charArray1[j] == charArray2[i]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
                ans = Math.max(ans, dp[i][j]);
            }
        }

        return ans;
    }
}
