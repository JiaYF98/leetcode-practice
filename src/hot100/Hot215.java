package hot100;

import java.util.Random;

public class Hot215 {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSelect(int[] nums, int start, int end, int target) {
        swap(nums, start, start + new Random().nextInt(end - start + 1));
        int l = start, r = end;
        int pivot = nums[start];
        while (l < r) {
            while (l < r) {
                if (nums[r] < pivot) {
                    nums[l++] = nums[r];
                    break;
                } else {
                    r--;
                }
            }

            while (l < r) {
                if (nums[l] > pivot) {
                    nums[r--] = nums[l];
                    break;
                } else {
                    l++;
                }
            }
        }

        nums[l] = pivot;

        if (l == target) {
            return pivot;
        } else if (l < target) {
            return quickSelect(nums, l + 1, end, target);
        } else {
            return quickSelect(nums, start, r - 1, target);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
