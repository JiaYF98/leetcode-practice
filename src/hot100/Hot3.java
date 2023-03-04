package hot100;

/*
Given a string s, find the length of the longest substring without repeating characters.

        Example 1:

        Input: s = "abcabcbb"
        Output: 3
        Explanation: The answer is "abc", with the length of 3.
        Example 2:

        Input: s = "bbbbb"
        Output: 1
        Explanation: The answer is "b", with the length of 1.
        Example 3:

        Input: s = "pwwkew"
        Output: 3
        Explanation: The answer is "wke", with the length of 3.
        Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

        Constraints:

        0 <= s.length <= 5 * 104
        s consists of English letters, digits, symbols and spaces.

        链接：https://leetcode.cn/problems/longest-substring-without-repeating-characters
*/

import java.util.*;

public class Hot3 {
    public int lengthOfLongestSubstring(String s) {
        // 如果为空串直接返回 0
        if (s.length() == 0) {
            return 0;
        }

        StringBuilder longestSubstring = new StringBuilder();
        longestSubstring.append(s.charAt(0));

        StringBuilder temp = new StringBuilder();
        temp.append(s.charAt(0));

        Set<Character> characterSet = new HashSet<>();
        characterSet.add(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {
            Character character = s.charAt(i);
            int preLength = characterSet.size();
            characterSet.add(character);

            // 如果有重复元素，清空之前的 temp 和 characterSet
            if (characterSet.size() == preLength) {

                // 如果 temp 的长度大于 longestSubstring 则替换并将 temp 清空
                if (temp.length() > longestSubstring.length()) {
                    longestSubstring.delete(0, longestSubstring.length());
                    longestSubstring.append(temp);
                }

                // 找到重复元素出现的位置
                int post = temp.indexOf(character.toString());

                // 删除该位置之前 temp 和 characterSet 中的所有元素
                List<Character> deleteCharacterList = new ArrayList<>();
                for (int k = 0; k < post; k++) {
                    deleteCharacterList.add(temp.charAt(k));
                }

                deleteCharacterList.forEach(characterSet::remove);
                temp.delete(0, post + 1);

                //将该重复元素加上
                temp.append(character);
            } else {
                temp.append(character);
            }
        }

        return Math.max(longestSubstring.length(), temp.length());
    }

    public static void main(String[] args) {
        Hot3 solution = new Hot3();
        String s1 = "abcabcbb";
        String s2 = "bbbbb";
        String s3 = "pwwkew";
        String s4 = "dvdf";
        int n = solution.lengthOfLongestSubstring(s4);

        System.out.println(solution.lengthOfLongestSubstring(s1) + "," + solution.lengthOfLongestSubstring(s2) + ","
                + solution.lengthOfLongestSubstring(s3) + "," + solution.lengthOfLongestSubstring(s4));
    }
}


