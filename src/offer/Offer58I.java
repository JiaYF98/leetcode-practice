package offer;

import java.util.ArrayList;
import java.util.List;

public class Offer58I {
    public String reverseWords(String s) {
        if (s.length() == 0) {
            return "";
        }
        List<String> list = new ArrayList<>();
        int sLen = s.length();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sLen; i++) {
            if (s.charAt(i) == ' ') {
                if (sb.length() != 0) {
                    list.add(sb.toString());
                    sb.delete(0, sb.length());
                }
            } else {
                sb.append(s.charAt(i));
            }
        }
        if (sb.length() != 0) {
            list.add(sb.toString());
        }

        if (list.size() == 0) {
            return "";
        }

        StringBuilder res = new StringBuilder();
        int listSize = list.size();
        for (int i = listSize - 1; i > 0; i--) {
            res.append(list.get(i));
            res.append(" ");
        }
        res.append(list.get(0));

        return res.toString();
    }

    public String reverseWords2(String s) {
        String[] strs = s.trim().split(" "); // 删除首尾空格，分割字符串
        StringBuilder res = new StringBuilder();
        for(int i = strs.length - 1; i >= 0; i--) { // 倒序遍历单词列表
            if(strs[i].equals("")) continue; // 遇到空单词则跳过
            res.append(strs[i]).append(" "); // 将单词拼接至 StringBuilder
        }
        return res.toString().trim(); // 转化为字符串，删除尾部空格，并返回
    }
}
