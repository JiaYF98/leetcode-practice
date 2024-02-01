package question;

public class Question674 {
    public int findLengthOfLCIS(int[] nums) {
        int maxLength = 1, length = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                length++;
                maxLength = Math.max(maxLength, length);
            } else {
                length = 1;
            }
        }
        maxLength = Math.max(maxLength, length);

        return maxLength;
    }
}
