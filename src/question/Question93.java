package question;

import java.util.ArrayList;
import java.util.List;

public class Question93 {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        StringBuilder sb = new StringBuilder();
        backTracing(s, 0, 0, sb, res);
        return res;
    }

    private void backTracing(String s, int start, int number, StringBuilder sb, List<String> res) {
        int length = s.length();
        // 如果已经有四个分隔符并且所有字符都用上了
        if (number == 4 && start == length) {
            sb.deleteCharAt(sb.length() - 1);
            String string = sb.toString();
            res.add(string);
        }

        if (number == 4 || start == length) {
            sb.deleteCharAt(sb.length() - 1);
            return;
        }

        // 控制范围不超过255
        int subMaxLength = 3;
        char startNumber = s.charAt(start);
        if (startNumber - '0' == 0) {
            subMaxLength = 1;
        } else if (startNumber - '0' > 2) {
            subMaxLength = 2;
        } else if (startNumber - '0' == 2) {
            if (start < s.length() - 1 && s.charAt(start + 1) - '0' > 5) {
                subMaxLength = 2;
            }

            if (start < s.length() - 2 && s.charAt(start + 1) - '0' == 5 && s.charAt(start + 2) - '0' > 5) {
                subMaxLength = 2;
            }
        }

        // 如果这个数已经超过255或者已经遍历完字符串 则不再循环
        for (int i = start; i - start < subMaxLength && i < length; i++) {
            sb.append(s.charAt(i));
            sb.append('.');
            backTracing(s, i + 1, number + 1, sb, res);
        }

        int deleteStart = sb.lastIndexOf(".");
        int deleteEnd = sb.length();
        if (deleteStart != -1) {
            sb.delete(deleteStart, deleteEnd);
        }
    }
}
