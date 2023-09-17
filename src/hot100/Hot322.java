package hot100;

import java.util.Arrays;

public class Hot322 {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        Arrays.fill(dp, amount + 1);
        dp[0] = 0;

        for (int coin : coins) {
            for (int j = coin; j <= amount; j++) {
                if (dp[j] <= amount || dp[j - coin] <= amount) {
                    dp[j] = Math.min(dp[j], dp[j - coin] + 1);
                }
            }
        }

        return dp[amount] <= amount ? dp[amount] : -1;
    }
}
