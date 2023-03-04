package offer;

public class Offer48 {
    public int lengthOfLongestSubstring(String s) {
        if (s.length() == 0) {
            return 0;
        }

        boolean[] isExist = new boolean[26];
        int max = 0;
        int left = 0;
        int right = 0;
        int len = s.length();

        while (right < len) {
            int index = s.charAt(right) - 'a';
            if (isExist[index]) {
                max = Math.max(max, right - left);

                // 左指针找到与右指针相等的位置
                while (left < right) {
                    if (s.charAt(left) == s.charAt(right)) {
                        left++;
                        right++;
                        break;
                    }

                    isExist[s.charAt(left) - 'a'] = false;
                    left++;
                }

            } else {
                isExist[index] = true;
                right++;
            }
        }
        return Math.max(max, right - left);
    }
}
