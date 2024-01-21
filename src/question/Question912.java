package question;

public class Question912 {
    public int[] sortArray(int[] nums) {
        quickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void quickSort(int[] nums, int start, int end) {
        if (start >= end) {
            return;
        }

        // 选取枢纽
        int mid = (start + end) / 2;
        int tmp = nums[mid];
        nums[mid] = nums[start];
        nums[start] = tmp;
        int pivot = nums[start];

        int i = start;
        int j = end;

        while (i < j) {
            while (j > i) {
                if (nums[j] <= pivot) {
                    nums[i++] = nums[j];
                    break;
                }
                j--;
            }

            while (i < j) {
                if (nums[i] >= pivot) {
                    nums[j--] = nums[i];
                    break;
                }
                i++;
            }
        }
        nums[i] = pivot;

        quickSort(nums, start, i - 1);
        quickSort(nums, i + 1, end);
    }
}
