package hot100;

import java.util.Arrays;

public class Hot416 {
    public boolean canPartition(int[] nums) {
        if (nums.length == 1) {
            return false;
        }

        int sum = Arrays.stream(nums).sum();

        if (sum % 2 != 0) {
            return false;
        }

        int target = sum / 2;
        int[] dp = new int[target + 1];

        for (int num : nums) {
            for (int j = target; j >= num; j--) {
                dp[j] = Math.max(dp[j], dp[j - num] + num);
            }
        }

        return dp[target] == target;
    }
}
