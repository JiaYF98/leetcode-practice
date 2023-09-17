package hot100;

public class Hot41 {
    public int firstMissingPositive(int[] nums) {
        // 遍历数组 找到数组中正整数的最大值和最小值
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > 0) {
                min = Math.min(num, min);
                max = Math.max(num, max);
            }
        }

        // 如果min不为1，则返回1，若不为1
        if (min != 1) {
            return 1;
        }

        int count = max - min + 1;

        // 调整位置
        for (int i = 0; i < nums.length; i++) {
            while (nums[i] - min != i) {
                if (nums[i] - min < 0 || nums[i] - min >= nums.length || nums[nums[i] - min] == nums[i]) {
                    break;
                }

                int tmp = nums[nums[i] - min];
                nums[nums[i] - min] = nums[i];
                nums[i] = tmp;
            }
        }

        // 寻找第一个不存在的正整数
        for (int i = 0; i < count; i++) {
            if (nums[i] - min != i) {
                return i + min;
            }
        }

        return max + 1;
    }
}
