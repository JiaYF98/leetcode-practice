package hot100;

public class Hot152 {
    public int maxProduct(int[] nums) {
        int[] dp = new int[nums.length + 1];
        dp[0] = 1;

        for (int i = 0; i < nums.length; i++) {
            if (dp[i] == 0) {
                dp[i + 1] = nums[i];
            } else {
                dp[i + 1] = dp[i] * nums[i];
            }
        }

        int res = dp[1];
        int lastZero = 0;
        for (int i = 2; i < dp.length; i++) {
            if (dp[i] == 0) {
                res = Math.max(res, 0);
                lastZero = i;
                continue;
            }
            for (int j = lastZero; j < i; j++) {
                if (dp[j] == 0) {
                    res = Math.max(dp[i], res);
                }
                else {
                    res = Math.max(dp[i] / dp[j], res);
                }
            }
        }

        return res;
    }
}
