package offer;

import java.util.Arrays;

public class Interview61 {
    public boolean isStraight(int[] nums) {
        Arrays.sort(nums);
        int kingNumber = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                kingNumber++;
            } else {
                if (i == 0)
                    continue;
                if (nums[i - 1] == nums[i])
                    return false;
                if (nums[i - 1] != 0 && nums[i] - nums[i - 1] > 1) {
                    if (nums[i] - nums[i - 1] - 1 > kingNumber) {
                        return false;
                    }

                    kingNumber -= (nums[i] - nums[i - 1] - 1);
                }
            }
        }

        return true;
    }

    /*
    题解思路：排序 + 遍历
     */
     public boolean isStraight2(int[] nums) {
        int joker = 0;
        Arrays.sort(nums); // 数组排序
        for(int i = 0; i < 4; i++) {
            if(nums[i] == 0) joker++; // 统计大小王数量
            else if(nums[i] == nums[i + 1]) return false; // 若有重复，提前返回 false
        }
        return nums[4] - nums[joker] < 5; // 最大牌 - 最小牌 < 5 则可构成顺子
    }
}
