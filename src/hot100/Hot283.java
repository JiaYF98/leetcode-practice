package hot100;

public class Hot283 {
    public void moveZeroes(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            if (nums[start] == 0) {
                System.arraycopy(nums, start + 1, nums, start, end - start);
                nums[end] = 0;
                end--;
            } else {
                start++;
            }
        }
    }

    public void moveZeroes2(int[] nums) {
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
            }
        }

        for (int i = index; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
