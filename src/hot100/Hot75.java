package hot100;

public class Hot75 {
    public void sortColors(int[] nums) {
        int red = 0;
        int write = 0;

        for (int num : nums) {
            if (num == 0)
                red++;
            else if (num == 1)
                write++;
        }

        for (int i = 0; i < red; i++) {
            nums[i] = 0;
        }

        int writeEnd = red + write;
        for (int i = red; i < writeEnd; i++) {
            nums[i] = 1;
        }

        int blueEnd = nums.length;
        for (int i = writeEnd; i < blueEnd; i++) {
            nums[i] = 2;
        }
    }

    /*
        双指针
     */
    public void sortColors2(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        for (int i = 0; i <= right; i++) {
            if (nums[i] == 0) {
                swap(nums, i, left);
                left++;
            } else if (nums[i] == 2) {
                swap(nums, i, right);
                right--;
                i--;
            }
        }
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}
