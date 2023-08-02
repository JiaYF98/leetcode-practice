package hot100;

public class Hot198 {
    public int rob(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }

        if (nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }

        if (nums.length == 3) {
            return Math.max(nums[0] + nums[2], nums[1]);
        }

        int length = nums.length;

        nums[2] += nums[0];
        for (int i = 3; i < length; i++) {
            nums[i] += Math.max(nums[i - 2], nums[i - 3]);
        }

        return Math.max(nums[length - 2], nums[length - 1]);
    }
}
