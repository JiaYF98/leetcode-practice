package offer;

public class Offer21 {
    /*
    思路：快慢指针
    快指针往后遍历，遇到奇数就与慢指针交换，快慢指针同时往后移动一个，否则快指针往后移动一个，慢指针不动。
    当慢指针移动到数组之后时结束
     */
    public int[] exchange(int[] nums) {
        if (nums.length == 0) {
            return nums;
        }

        int quickIndex = 0;
        int slowIndex = 0;
        int len = nums.length;

        while (quickIndex < len) {
            if (nums[quickIndex] % 2 != 0) {
                int temp = nums[slowIndex];
                nums[slowIndex] = nums[quickIndex];
                nums[quickIndex] = temp;
                quickIndex++;
                slowIndex++;
            } else {
                quickIndex++;
            }
        }

        return nums;
    }

    public int[] exchange2(int[] nums) {
        int[] res = new int[nums.length];
        int l = 0, r = nums.length - 1;
        for (int num : nums) {
            if (num % 2 == 1) {
                res[l++] = num;
            } else {
                res[r--] = num;
            }
        }
        return res;
    }
}
