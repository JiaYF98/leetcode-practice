package offer;

import java.util.ArrayList;
import java.util.List;

public class Offer46 {
    /*
        思路：
        第一个数字有一种翻译方法
        加入后一个数字，如果前一个数字小于等于2并且后一个数字小于等于5，则翻译方法为前一个数字的方法数加前前数字的方法数，否则翻译方法与前一个相等
     */
    public int translateNum(int num) {
        if (num <= 9) {
            return 1;
        }

        List<Integer> nums = new ArrayList<>();

        while (num != 0) {
            nums.add(num % 10);
            num /= 10;
        }

        int len = nums.size();
        int[] result = new int[len + 1];

        result[len] = 1;
        result[len - 1] = 1;

        for (int i = len - 2; i >= 0; i--) {
            if (nums.get(i + 1) == 1 || nums.get(i + 1) == 2 && nums.get(i) <= 5)
                result[i] = result[i + 1] + result[i + 2];
            else result[i] = result[i + 1];
        }

        return result[0];
    }

    public int translateNum2(int num) {
        int a = 1, b = 1, x, y = num % 10;
        while (num != 0) {
            num /= 10;
            x = num % 10;
            int tmp = 10 * x + y;
            int c = (tmp >= 10 && tmp <= 25) ? a + b : a;
            b = a;
            a = c;
            y = x;
        }
        return a;
    }

}
