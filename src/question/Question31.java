package question;

public class Question31 {
    public void nextPermutation(int[] nums) {
        int i = nums.length;
        while (--i > 0) {
            if (nums[i] > nums[i - 1]) {
                // 从末尾找第一个比num[i - 1]大的元素，与i - 1处的元素交换
                int j = nums.length - 1;
                while (nums[j] <= nums[i - 1]) {
                    j--;
                }
                swap(nums, i - 1, j);
                break;
            }
        }
        reverse(nums, i, nums.length - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}
