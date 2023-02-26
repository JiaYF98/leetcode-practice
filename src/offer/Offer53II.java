package offer;

public class Offer53II {

    // 直接查找
    public int missingNumber1(int[] nums) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] != i) {
                return i;
            }
        }
        return len;
    }

    // 二分查找
    public int missingNumber2(int[] nums) {
        System.gc();
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == mid) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return left;
    }


    public static void main(String[] args) {
        Offer53II offer53II = new Offer53II();
        System.out.println(offer53II.missingNumber1(new int[]{0, 1, 3}));
        System.out.println(offer53II.missingNumber1(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9}));
    }
}
