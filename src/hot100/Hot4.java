package hot100;

public class Hot4 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] nums = new int[nums1.length + nums2.length];
        int i = 0, j = 0;
        int index = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] > nums2[j]) {
                nums[index++] = nums2[j++];
            } else {
                nums[index++] = nums1[i++];
            }
        }

        while (i < nums1.length) {
            nums[index++] = nums1[i++];
        }

        while (j < nums2.length) {
            nums[index++] = nums2[j++];
        }

        if (nums.length % 2 == 0) {
            return (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0;
        } else {
            return nums[nums.length / 2];
        }
    }
}
