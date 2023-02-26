package offer;

public class Offer53I {
    // 哈希
    public int search1(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < min) {
                min = num;
            }

            if (num > max) {
                max = num;
            }
        }

        int interval = max - min + 1;

        int[] count = new int[interval];

        for (int num : nums) {
            count[(num - min) % interval]++;
        }

        int newTarget = target - min;
        if (newTarget >= 0 && newTarget < interval) {
            return count[(target - min) % interval];
        }

        return 0;
    }

    // 直接查找
    public int search2(int[] nums, int target) {
        int count = 0;
        for (int num : nums) {
            if (num == target)
                count++;
        }
        return count;
    }

    // 折半查找
    public int search3(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int flag = -1;
        int count = 0;

        while (left <= right) {
            int mid = (right - left) / 2 + left;
            if (nums[mid] == target) {
                flag = mid;
                break;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            }
        }

        if (flag != -1) {
            int len = nums.length;

            // 向后找
            for (int i = flag; i < len && nums[i] == target; i++) {
                count++;
            }

            // 向前找
            for (int i = flag - 1; i >= 0 && nums[i] == target; i--) {
                if (nums[i] == target) {
                    count++;
                }
            }
        }

        return count;
    }


    public static void main(String[] args) {
        Offer53I offer53 = new Offer53I();
//        System.out.println(offer53.search3(new int[]{5, 7, 7, 8, 8, 10}, 8));
//        System.out.println(offer53.search3(new int[]{5, 7, 7, 8, 8, 10}, 6));
//        System.out.println(offer53.search3(new int[]{-5, -7, -7, 8, 8, 10}, 8));
        System.out.println(offer53.search3(new int[]{-1, -1, 0, 0, 0}, 0));
//        System.out.println(offer53.search3(new int[]{1}, 0));
//        System.out.println(offer53.search3(new int[]{2, 2}, 3));
//        System.out.println(offer53.search3(new int[]{}, 3));
    }
}
