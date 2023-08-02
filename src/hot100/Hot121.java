package hot100;

public class Hot121 {
    public int maxProfit(int[] prices) {
        int res = 0;
        int left = 0;
        int right = 1;
        while (right < prices.length) {
            if (prices[right] - prices[left] < 0) {
                left = right;
                right++;
            } else {
                res = Math.max(res, prices[right++] - prices[left]);
            }
        }

        return res;
    }
}
