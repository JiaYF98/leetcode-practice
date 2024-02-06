package question;

public class Question8 {
    public int myAtoi(String s) {
        char[] sCharArray = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        boolean negative = false;

        int index = 0;
        // 丢弃前导空格和无用字符
        while (index < sCharArray.length) {
            char c = sCharArray[index];
            if (c == ' ') {
                index++;
            } else if (c == '+' || c == '-' || c >= '0' && c <= '9') {
                break;
            } else {
                return 0;
            }
        }

        if (index == sCharArray.length) {
            return 0;
        }

        if (sCharArray[index] == '-') {
            negative = true;
            index++;
        } else if (sCharArray[index] == '+') {
            index++;
        }

        // 舍弃前面的0
        while (index < sCharArray.length) {
            if (sCharArray[index] == '0') {
                index++;
            } else {
                break;
            }
        }

        while (index < sCharArray.length) {
            char c = sCharArray[index];
            if (c < '0' || c > '9') {
                // 舍弃其余部分
                break;
            }
            stringBuilder.append(c);
            index++;
        }

        String numStr = stringBuilder.reverse().toString();
        if (numStr.length() > 10) {
            return negative ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }

        long num = 0;
        int pos = 1;
        for (int i = 0; i < numStr.length(); i++) {
            num += (long) pos * (numStr.charAt(i) - '0');
            pos *= 10;
        }

        return (int) (negative ? Math.max(Integer.MIN_VALUE, num * (-1)) : Math.min(Integer.MAX_VALUE, num));
    }
}
