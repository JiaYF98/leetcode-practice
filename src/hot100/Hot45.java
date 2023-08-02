package hot100;

import java.util.Arrays;

public class Hot45 {
    public int jump(int[] nums) {
        int[] minSteps = new int[nums.length];

        int index = 1;
        // 从前往后遍历，如果index在当前位置能到达最远位置之前，则从index到当前位置所能到达的最远位置的minStep的值为当前位置minStep的值+1
        for (int i = 0; i < nums.length; i++) {
            if (index >= nums.length) {
                break;
            }

            if (index <= i + nums[i]) {
                int newIndex = i + nums[i] + 1;
                Arrays.fill(minSteps, index, Math.min(newIndex, nums.length), minSteps[i] + 1);
                index = newIndex;
            }
        }

        return minSteps[nums.length - 1];
    }

    public int jump2(int[] nums) {
        int ans = 0;
        int end = 0;
        int maxPos = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            maxPos = Math.max(nums[i] + i, maxPos);

            if (i == end) {
                end = maxPos;
                ans++;
            }
        }
        return ans;
    }
}
