package question;

public class Question42 {
    public int trap(int[] height) {
        int[] max1 = new int[height.length];
        int[] max2 = new int[height.length];

        max1[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            max1[i] = Math.max(max1[i - 1], height[i]);
        }

        max2[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            max2[i] = Math.max(max2[i + 1], height[i]);
        }

        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += Math.min(max1[i], max2[i]) - height[i];
        }

        return sum;
    }
}
