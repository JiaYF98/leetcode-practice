package question;

import java.util.HashMap;
import java.util.Map;

public class Question76 {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        char[] sCharArray = s.toCharArray();
        char[] tCharArray = t.toCharArray();

        int resultStart = -1;
        int resultEnd = s.length();

        Map<Character, Integer> map = new HashMap<>();
        int start = 0;
        int end = 0;
        for (int i = 0; i < t.length(); i++) {
            map.put(tCharArray[i], map.getOrDefault(tCharArray[i], 0) + 1);
        }

        // 遍历集合中的元素 如果滑动窗口中缺少这个元素 指针一直往后移动
        // 如果滑动窗口已经到达最后 如果还有元素不包含 则滑动窗口后端再增加缺少元素的个数 防止最后几个字符满足条件的情况
        while (end < s.length()) {
            for (Map.Entry<Character, Integer> entry : map.entrySet()) {
                while (entry.getValue() > 0 && end < s.length()) {
                    if (map.containsKey(sCharArray[end])) {
                        map.put(sCharArray[end], map.get(sCharArray[end]) - 1);
                    }
                    end++;
                }
            }

            // 如果滑动窗口中不是覆盖子串，则end往后移动
            if (!isSubString(map)) {
                end++;
                continue;
            }

            // 滑动窗口中的元素已经是覆盖子串 则缩小滑动窗口的范围
            while (!map.containsKey(sCharArray[start]) || map.get(sCharArray[start]) < 0) {
                if (map.containsKey(sCharArray[start])) {
                    map.put(sCharArray[start], map.get(sCharArray[start]) + 1);
                }
                start++;
            }

            if (end - start < resultEnd - resultStart) {
                resultStart = start;
                resultEnd = end;
            }

            map.put(sCharArray[start], map.get(sCharArray[start]) + 1);
            start++;
        }

        if (resultStart == -1) {
            return "";
        } else {
            return s.substring(resultStart, resultEnd);
        }
    }

    private boolean isSubString(Map<Character, Integer> map) {
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 0) {
                return false;
            }
        }
        return true;
    }
}
