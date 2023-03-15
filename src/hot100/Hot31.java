package hot100;

import java.util.Arrays;
import java.util.Collections;

public class Hot31 {
    /*
    思路：
        指针指到数组的最后，找到第一个使得数组不是逆向升序的位置，与该位置后面大于该位置值的最小值交换位置，将此位置往后的数组逆转
        否则指针往前移动，若指针指到最前面的值，则将数组逆转
     */
    public void nextPermutation(int[] nums) {
        int index = nums.length - 1;

        while (index >= 1) {
            if (nums[index] > nums[index - 1]) {
                int position = findPosition(nums, index, nums.length - 1, nums[index - 1]);
                swap(nums, index - 1, position);
                break;
            }
            index--;
        }

        reverse(nums, index, nums.length - 1);
    }

    private int findPosition(int[] nums, int start, int end, int target) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] <= target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start - 1;
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void reverse(int[] nums, int start, int end) {
        int i = start;
        int j = end;
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
