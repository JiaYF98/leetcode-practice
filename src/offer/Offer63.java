package offer;

public class Offer63 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int len = prices.length;
        int[] maxPrice = new int[len];
        int[] minPrice = new int[len];

        minPrice[0] = prices[0];
        for (int i = 1; i < len; i++) {
            minPrice[i] = Math.min(prices[i], minPrice[i - 1]);
        }

        maxPrice[len - 1] = prices[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            maxPrice[i] = Math.max(prices[i], maxPrice[i + 1]);
        }

        int maxProfit = 0;

        for (int i = 0; i < len; i++) {
            maxProfit = Math.max(maxProfit, maxPrice[i] - minPrice[i]);
        }

        return maxProfit;
    }

    public int maxProfit2(int[] prices) {
        if (prices.length <= 1) return 0;
        int min = prices[0];
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }

}
