package question;

import java.util.HashSet;
import java.util.Set;

public class Question3 {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.isEmpty()) {
            return 0;
        }

        Set<Character> set = new HashSet<>();

        char[] sCharArray = s.toCharArray();
        int left = 0, right = 0;
        int maxLength = 1;
        while (right < sCharArray.length) {
            int size = set.size();
            set.add(sCharArray[right]);
            if (size == set.size()) {
                maxLength = Math.max(maxLength, right - left);
                while (left < right) {
                    if (sCharArray[left] == sCharArray[right]) {
                        set.remove(sCharArray[left]);
                        left++;
                        break;
                    }

                    set.remove(sCharArray[left]);
                    left++;
                }
            } else {
                right++;
            }
        }
        maxLength = Math.max(maxLength, right - left);

        return maxLength;
    }
}
