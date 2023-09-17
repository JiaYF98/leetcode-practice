package hot100;

public class Hot76 {
    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }

        char[] tCharArray = t.toCharArray();
        char[] sCharArray = s.toCharArray();

        // 目标字符串中各元素数量
        int[] tCharNums = new int[52];

        // t中各元素个数
        for (char c : tCharArray) {
            if (c >= 'a') {
                tCharNums[c - 'a' + 26]++;
            } else {
                tCharNums[c - 'A']++;
            }
        }

        int start = 0, end = 0;
        int resultStart = -1, resultLength = Integer.MAX_VALUE;

        // 窗口中各元素数量
        int[] windowCharNums = new int[52];

        while (end < s.length()) {
            // 滑动窗口加入end位置
            char endChar = sCharArray[end];
            if (endChar >= 'a') {
                windowCharNums[endChar - 'a' + 26]++;
            } else {
                windowCharNums[endChar - 'A']++;
            }

            // 窗口中元素个数小于目标字符串中元素个数
            if (end - start + 1 < t.length()) {
                end++;
                continue;
            }

            // 从start到end的子串是否是覆盖子串
            boolean isWindowSubString = true;

            // 判断从start到end的子串是否满足覆盖子串
            for (int i = 0; i < 52; i++) {
                if (windowCharNums[i] < tCharNums[i]) {
                    isWindowSubString = false;
                    break;
                }
            }

            while (isWindowSubString) {
                // 更新最小覆盖子串
                if (end - start + 1 < resultLength) {
                    resultStart = start;
                    resultLength = end - start + 1;
                }

                // start往后移动
                char startChar = sCharArray[start++];

                if (startChar >= 'a') {
                    // 窗口中的某个元素数量小于目标对应元素的数量，则从start到end的子串不满足条件
                    if (--windowCharNums[startChar - 'a' + 26] < tCharNums[startChar - 'a' + 26]) {
                        isWindowSubString = false;
                    }
                } else {
                    if (--windowCharNums[startChar - 'A'] < tCharNums[startChar - 'A']) {
                        isWindowSubString = false;
                    }
                }
            }

            // start到end的子串不满足条件，滑动窗口往后移动
            end++;
        }

        return resultStart == -1 ? "" : new String(sCharArray, resultStart, resultLength);
    }
}
