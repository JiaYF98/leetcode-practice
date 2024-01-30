package question;

public class Question121 {
    public int maxProfit(int[] prices) {
        // dp[0] 代表该天买入状态
        // dp[1] 代表该天卖出状态
        int[][] dp = new int[2][prices.length];

        dp[0][0] = -prices[0];
        dp[1][0] = 0;

        for (int i = 1; i < prices.length; i++) {
            dp[0][i] = Math.max(dp[0][i - 1], -prices[i]);
            dp[1][i] = Math.max(dp[1][i - 1], dp[0][i - 1] + prices[i]);
        }

        return dp[1][prices.length - 1];
    }

    public int maxProfit2(int[] prices) {
        int maxProfit = 0;

        prices[0] = -prices[0];
        for (int i = 1; i < prices.length; i++) {
            maxProfit = Math.max(maxProfit, prices[i - 1] + prices[i]);
            prices[i] = Math.max(prices[i - 1], -prices[i]);
        }

        return maxProfit;
    }

    public int maxProfit3(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int price : prices) {
            if (price < minPrice) {
                minPrice = price;
            } else if (price - minPrice > maxProfit) {
                maxProfit = price - minPrice;
            }
        }

        return maxProfit;
    }
}
