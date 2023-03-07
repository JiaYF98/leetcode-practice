package offer;

public class Offer57 {
    public int[] twoSum(int[] nums, int target) {
        int leftIndex = 0;
        int rightIndex = nums.length - 1;

        while (leftIndex < rightIndex) {
            if (nums[rightIndex] + nums[leftIndex] > target) {
                rightIndex--;
            } else if (nums[rightIndex] + nums[leftIndex] < target) {
                leftIndex++;
            } else {
                return new int[]{nums[leftIndex], nums[rightIndex]};
            }
        }

        return new int[0];
    }
}
