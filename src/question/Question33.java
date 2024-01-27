package question;

public class Question33 {
    public int search(int[] nums, int target) {
        return binarySearch(nums, 0, nums.length - 1, target);
    }

    private int binarySearch(int[] nums, int start, int end, int target) {
        if (start > end) {
            return -1;
        }

        int mid = (start + end) / 2;
        if (nums[mid] == target) {
            return mid;
        }

        // 前半段有序
        if (nums[start] <= nums[mid]) {
            if (nums[start] <= target && nums[mid] > target) {
                return binarySearch(nums, start, mid - 1, target);
            } else {
                return binarySearch(nums, mid + 1, end, target);
            }
        } else {
            // 后半段有序
            if (nums[end] >= target && nums[mid] < target) {
                return binarySearch(nums, mid + 1, end, target);
            } else {
                return binarySearch(nums, start, mid - 1, target);
            }
        }
    }
}
