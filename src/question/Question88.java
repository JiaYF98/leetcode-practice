package question;

public class Question88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] mergedNums = new int[m + n];

        int index1 = 0, index2 = 0;
        int index = 0;
        while (index1 < m && index2 < n) {
            if (nums1[index1] < nums2[index2]) {
                mergedNums[index++] = nums1[index1++];
            } else {
                mergedNums[index++] = nums2[index2++];
            }
        }

        while (index1 < m) {
            mergedNums[index++] = nums1[index1++];
        }
        while (index2 < n) {
            mergedNums[index++] = nums2[index2++];
        }

        index = 0;
        while (index < m + n) {
            nums1[index] = mergedNums[index++];
        }
    }
}
