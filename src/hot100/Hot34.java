package hot100;

public class Hot34 {
    public int[] searchRange(int[] nums, int target) {
        int start = binarySearch(nums, target);
        if (start == -1) {
            return new int[]{-1, -1};
        }

        int end = 0;
        int numsLength = nums.length;
        int tmp = start;
        while (tmp < numsLength) {
            if (nums[tmp] != target) {
                end = tmp - 1;
                break;
            }
            tmp++;
        }

        if (tmp == numsLength) {
            end = numsLength - 1;
        }

        return new int[]{start, end};
    }

    private int binarySearch(int[] nums, int target) {
        int length = nums.length;
        int left = 0;
        int right = length - 1;
        while (left <= right) {
            int middle = (left + right) / 2;
            if (nums[middle] >= target) {
                right = middle - 1;
            } else {
                left = middle + 1;
            }
        }

        if (left >= length || nums[left] != target) {
            return -1;
        }

        return left;
    }
}
