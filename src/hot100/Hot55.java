package hot100;

public class Hot55 {
    public boolean canJump(int[] nums) {
        int longest = 0;
        for (int i = 0; i < nums.length; i++) {
            if (longest >= nums.length - 1) {
                return true;
            }

            if (i > longest) {
                return false;
            }

            longest = Math.max(longest, i + nums[i]);
        }
        return false;
    }
}
