package hot100;

public class Hot33 {
    public int search(int[] nums, int target) {
        int k = findK(nums);
        int leftResult = -1;
        int rightResult = -1;

        if (k > 0)
            leftResult = binarySearch(nums, 0, k - 1, target);
        if (k < nums.length)
            rightResult = binarySearch(nums, k, nums.length - 1, target);

        return leftResult == -1 ? rightResult : leftResult;
    }

    private int findK(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        while (left < right) {
            int mid = (left + right) / 2;
            if (nums[mid] >= nums[right]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }

        return right;
    }

    private int binarySearch(int[] nums, int left, int right, int target) {
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return -1;
    }
}
