package question;

import java.util.Arrays;
import java.util.Comparator;

public class Question1 {
    public int[] twoSum(int[] nums, int target) {
        int[][] newNums = new int[nums.length][2];
        for (int i = 0; i < nums.length; i++) {
            newNums[i] = new int[]{nums[i], i};
        }
        Arrays.sort(newNums, Comparator.comparingInt(x -> x[0]));

        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (newNums[left][0] + newNums[right][0] == target) {
                return new int[]{newNums[left][1], newNums[right][1]};
            } else if (newNums[left][0] + newNums[right][0] < target) {
                int leftNumber = newNums[left][0];
                while (++left < right && newNums[left][0] == leftNumber) ;
            } else {
                int rightNumber = newNums[right][0];
                while (--right > left && newNums[right][0] == rightNumber) ;
            }
        }

        return new int[0];
    }
}
