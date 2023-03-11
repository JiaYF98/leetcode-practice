package offer;


public class Offer41 {
    private static class MedianFinder {
        private int size;
        private int[] nums;

        public MedianFinder() {
            size = 0;
            nums = new int[64];
        }

        public void addNum(int num) {
            // 数组中添加新数
            int insertPosition = findInsertPosition(nums, num);
            if (size - insertPosition > 0)
                System.arraycopy(nums, insertPosition, nums, insertPosition + 1, size - insertPosition);
            nums[insertPosition] = num;
            size++;

            // 数组被填满开辟新的数组
            if (size == nums.length) {
                int[] newNums = new int[size * 2];
                System.arraycopy(nums, 0, newNums, 0, size);
                nums = newNums;
            }
        }

        public double findMedian() {
            if (size == 0) {
                return 0.0;
            }

            int i = size - 1;
            return i % 2 == 0 ? (double) nums[i / 2] : (nums[i / 2] + nums[i / 2 + 1]) / 2.0;
        }

        private int findInsertPosition(int[] nums, int target) {
            int left = 0, right = size - 1;

            while (left <= right) {
                int middle = (left + right) / 2;
                if (nums[middle] > target) {
                    right = middle - 1;
                } else {
                    left = middle + 1;
                }
            }
            return left;
        }
    }

    private final MedianFinder mf;

    public Offer41() {
        mf = new MedianFinder();
    }

    public void addNumber(int num) {
        this.mf.addNum(num);
    }

    public double findMedian() {
        return this.mf.findMedian();
    }
}
