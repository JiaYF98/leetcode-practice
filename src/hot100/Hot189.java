package hot100;

public class Hot189 {
    public void rotate(int[] nums, int k) {
        k = k % nums.length;
        int[] newNums = new int[nums.length];
        System.arraycopy(nums, nums.length - k, newNums, 0, k);
        System.arraycopy(nums, 0, newNums, k, nums.length - k);
        System.arraycopy(newNums, 0, nums, 0, nums.length);
    }
}
