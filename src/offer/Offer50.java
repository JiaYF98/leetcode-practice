package offer;

import java.util.Arrays;

public class Offer50 {
    public char firstUniqChar(String s) {
        if ("".equals(s)) {
            return ' ';
        }

        char[] origin = s.toCharArray();

        char[] isSingle = new char[26];

        int len = origin.length;

        for (char c : origin) {
            int index = c % 'a';
            if (isSingle[index] < 2) {
                isSingle[index]++;
            }
        }

        for (char c : origin) {
            int index = c % 'a';
            if (isSingle[index] == 1) {
                return c;
            }
        }

        return ' ';
    }

    public static void main(String[] args) {
        Offer50 offer50 = new Offer50();
        System.out.println(offer50.firstUniqChar("abaccdeff"));
        System.out.println(offer50.firstUniqChar(""));
        System.out.println(offer50.firstUniqChar("aabbccdd"));
    }
}
