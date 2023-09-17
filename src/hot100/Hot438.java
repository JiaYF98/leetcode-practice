package hot100;

import java.util.ArrayList;
import java.util.List;

public class Hot438 {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length()) {
            return result;
        }

        int windowSize = p.length();
        int[] charNums = new int[26];
        for (int i = 0; i < p.length(); i++) {
            charNums[p.charAt(i) - 'a']++;
        }

        // 滑动窗口中的元素
        int[] currentCharNums = new int[26];

        // 滑动窗口除最后一个外的元素
        for (int i = 0; i < windowSize - 1; i++) {
            currentCharNums[s.charAt(i) - 'a']++;
        }

        for (int i = windowSize - 1; i < s.length(); i++) {
            // 滑动窗口最后一个位置填充
            currentCharNums[s.charAt(i) - 'a']++;

            // 判断滑动窗口是否是否是p的字母异位词
            boolean flag = true;
            for (int j = 0; j < 26; j++) {
                if (charNums[j] != currentCharNums[j]) {
                    flag = false;
                    break;
                }
            }

            // 是p的字母异位词，则添加到结果中
            if (flag) {
                result.add(i - windowSize + 1);
            }

            // 将窗口往前移动
            currentCharNums[s.charAt(i - windowSize + 1) - 'a']--;
        }

        return result;
    }
}
