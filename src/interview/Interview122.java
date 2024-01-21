package interview;

public class Interview122 {
    public int maxProfit(int[] prices) {
        // 贪心
        int result = 0;
        for (int i = 1; i < prices.length; i++) {
            result += Math.max(prices[i] - prices[i - 1], 0);
        }
        return result;
    }

    public int maxProfit2(int[] prices) {
        int length = prices.length;
        int[][] dp = new int[length][2];
        // dp[i][0] 持有股票
        // dp[i][1] 不持有股票
        dp[0][0] = -prices[0];
        dp[0][1] = 0;

        for (int i = 1; i < length; i++) {
            dp[i][0] = Math.max(dp[i - 1][0], dp[i - 1][1] - prices[i]);
            dp[i][1] = Math.max(dp[i - 1][1], dp[i][0] + prices[i]);
        }

        // 最后一天持有股票的利润一定小于不持有股票的利润
        return dp[length - 1][1];
    }
}
