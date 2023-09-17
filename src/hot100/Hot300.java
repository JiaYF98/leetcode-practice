package hot100;

public class Hot300 {
    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        dp[0] = 1;

        int ans = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            if (dp[i] > ans) {
                ans = dp[i];
            }
        }

        return ans;
    }

    public int lengthOfLIS2(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int[] tails = new int[nums.length];
        int ans = 0;

        for (int num : nums) {
            int s = 0, e = ans;
            while (s < e) {
                int m = (s + e) / 2;
                if (num > tails[m]) {
                    s = m + 1;
                } else {
                    e = m;
                }
            }
            tails[s] = num;
            if (s == ans) {
                ans++;
            }
        }

        return ans;
    }
}
