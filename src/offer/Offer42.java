package offer;

public class Offer42 {
    public int maxSubArray(int[] nums) {
        int subSum = 0;
        int maxSubSum = nums[0];

        for (int num : nums) {
            subSum += num;

            maxSubSum = Math.max(subSum, maxSubSum);

            if (subSum < 0) {
                subSum = 0;
            }
        }

        return maxSubSum;
    }
}
