package hot100;

public class Hot53 {
    public int maxSubArray(int[] nums) {
        int currentResult = nums[0];
        int result = nums[0];
        for (int i = 1; i < nums.length; i++) {
            currentResult = Math.max(currentResult + nums[i], nums[i]);
            if (currentResult > result) {
                result = currentResult;
            }
        }

        return Math.max(result, currentResult);
    }
}
