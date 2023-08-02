package hot100;

import java.util.ArrayList;
import java.util.List;

public class Hot239 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        List<Integer> res = new ArrayList<>(nums.length - k + 1);

        // 先遍历k个值，记录最大值所在位置
        int maxIndex = getMaxIndex(nums, 0, k);
        res.add(nums[maxIndex]);

        // 往后遍历，如果遍历到的值大于最大值，则更新最大值所在的位置
        for (int i = k; i < nums.length; i++) {
            // 如果开始值在最大值后面，则重新查找最大值
            if (i - k + 1 > maxIndex) {
                maxIndex = getMaxIndex(nums, i - k + 1, i + 1);
            } else {
                if (nums[i] >= nums[maxIndex]) {
                    maxIndex = i;
                }
            }
            res.add(nums[maxIndex]);
        }

        return res.stream().mapToInt(Integer::intValue).toArray();
    }

    private int getMaxIndex(int[] nums, int start, int end) {
        int index = start;
        for (int i = start + 1; i < end; i++) {
            if (nums[i] >= nums[index])
                index = i;
        }

        return index;
    }
}
