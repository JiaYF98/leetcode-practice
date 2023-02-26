package hot100;

public class Hot42 {

    /*
    思路：双指针
        1. 先找到第一个不是0的数字，左指针同时指到这里，右指针往后一个
        2. 若右指针与左指针值相等或比左指针值大，则左右指针同时往后移动一个
        3. 右指针往后扫描直到第一个大于等于左指针且不出界的位置,同时记录比左指针值小的第一个最大值（至少比左指针后面一个值大的值）
        4. 如果能找到第一个大于等于左指针且不出界的位置，则临时指针从左指针右面开始扫到右指针，累加左指针数值和临时指针数值的差值
        5. 左指针指向右指针位置，右指针后移一个，重复2-4，直到结束
        5. 若右指针到头找不到比大于等于左指针的值，但有一个最大值且不是左指针后一个，则临时指针从左指针右面开始扫到最大值，累加次大值数值和临时指针数值的差值
        6. 左指针往后移动到最大值的位置，右指针指向左指针后一个，重复3-5，直到结束
     */
    public int trap1(int[] height) {
        // 如果只有一个或两个数，则返回 0
        if (height.length <= 2) {
            return 0;
        }

        int sum = 0;

        // 找到第一个不是0的数字
        int start = 0;
        for (int i = 0; i < height.length - 2; i++) {
            if (height[i] != 0) {
                start = i;
                break;
            }
        }

        // 如果左指针是倒数第二个，则直接返回 0
        if (start == height.length - 2) {
            return 0;
        }

        int end = start + 1;

        // 如果左指针是倒数第二个，就不用再累积了
        while (start < height.length - 2) {

            // 若右指针值比左指针值小，则继续分析
            if (height[start] > height[end]) {

                // 比左指针值小的最大值
                int max = height[end];

                // 最大值所在位置
                int maxFlag = end;

                // 最大值是否存在（是否存在比最大值小的值）
                boolean isMax = false;

                // 右指针往后扫描直到第一个大于等于左指针的位置
                while (end < height.length) {
                    if (height[start] <= height[end]) {
                        break;
                    }

                    // 更新最大值，如果有多个只记录第一个
                    if (height[end] > max) {
                        max = height[end];
                        maxFlag = end;
                        isMax = true;
                    }

                    // 判断最大值是否存在
                    if (height[end] < max) {
                        isMax = true;
                    }

                    end++;
                }

                // 如果右指针不出界
                if (end < height.length) {
                    // 临时指针从左指针扫到右指针，累加左指针数值和临时指针数值的差值
                    for (int i = start + 1; i < end; i++) {
                        sum += height[start] - height[i];
                    }
                    // 累加完之后，左指针指向右指针位置
                    start = end;
                }

                // 找到头找不到比左指针大的值，但有一个最大值且最大值不是左指针后一个，则临时指针从左指针右面开始扫到最大值，累加次大值数值和临时指针数值的差值
                else {
                    // 如果最大值存在且不是左指针后一个，临时指针从左指针右面开始扫到最大值，累加次大值数值和临时指针数值的差值
                    if (isMax && maxFlag != (start + 1)) {
                        for (int i = start + 1; i < maxFlag; i++) {
                            sum += height[maxFlag] - height[i];
                        }
                    }

                    // 左指针往后移动到最大值的位置
                    start = maxFlag;
                }
            }

            // 若右指针与左指针值相等或比左指针值大，则左指针往后移动一个
            else {
                start++;
            }

            // 每次操作完右指针都在左指针后一个
            end = start + 1;
        }

        return sum;
    }

    public int trap2(int[] height) {
        int len = height.length;

        if (len < 3) {
            return 0;
        }

        int[] leftMax = new int[len];
        int[] rightMax = new int[len];

        leftMax[0] = height[0];
        rightMax[len - 1] = height[len - 1];

        for (int i = 1; i < height.length; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        for (int i = len - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        int ans = 0;

        for (int i = 0; i < len; i++) {
            ans += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return ans;
    }

    public static void main(String[] args) {
        Hot42 hot42 = new Hot42();
//        System.out.println(hot42.trap(new int[]{0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
//        System.out.println(hot42.trap(new int[]{0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}));
        System.out.println(hot42.trap1(new int[]{4, 2, 0, 3, 2}));

    }
}
