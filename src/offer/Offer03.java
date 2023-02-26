package offer;

public class Offer03 {
    // 哈希法
    public int findRepeatNumber1(int[] nums) {
        int[] count = new int[nums.length];
        for (int num : nums) {
            if (count[num] == 1)
                return num;
            count[num]++;
        }
        return -1;
    }

    // 原地置换法
    public int findRepeatNumber2(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] == nums[nums[i]]) {
                return nums[i];
            }

            while (nums[i] != i) {
                int tmp = nums[i];
                nums[i] = nums[tmp];
                nums[tmp] = tmp;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        Offer03 offer03 = new Offer03();
        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(offer03.findRepeatNumber2(nums));
    }
}
