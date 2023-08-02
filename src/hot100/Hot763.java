package hot100;

import java.util.ArrayList;
import java.util.List;

public class Hot763 {
    public List<Integer> partitionLabels(String s) {
        List<Integer> res = new ArrayList<>(26);

        // 用一个数组存储字母所在的组数
        int[] group = new int[26];
        int groupCount = 1;

        // 遍历字符串
        for (int i = 0; i < s.length(); i++) {
            // 查询该字符的组数
            // 若为0，res添加一组数据，则该字符的组数赋值为groupCount，groupCount的值+1
            char c = s.charAt(i);
            if (group[c - 'a'] == 0) {
                res.add(1);
                group[c - 'a'] = groupCount++;
            } else {
                // 若不为0，则往回遍历，计算不同字符组数中元素的和，累加到该字符组数的元素个数中，并把与该字符组数不同的字符的组数设置为该字符的组数
                int target = group[c - 'a'];
                int sum = 1;
                for (int j = i - 1; j >= 0; j--) {
                    char temp = s.charAt(j);
                    int currentGroup = group[s.charAt(j) - 'a'];

                    if (group[temp - 'a'] < target) {
                        break;
                    }

                    // 删除一次
                    if (res.size() >= currentGroup) {
                        sum += res.remove(currentGroup - 1);
                    }

                    group[temp - 'a'] = target;
                }


                // groupCount设置为当前字符组数+1
                groupCount = target + 1;

                // 当前字符组数的元素增加sum
                if (res.size() >= target) {
                    res.add(res.remove(target - 1) + sum);
                } else {
                    res.add(sum);
                }
            }
        }

        return res;
    }
}
