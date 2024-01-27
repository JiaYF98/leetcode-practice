package question;

public class Question5 {
    private int start = 0;
    private int end = 0;

    // 中心扩散法
    public String longestPalindrome(String s) {
        char[] sCharArray = s.toCharArray();
        for (int i = 0; i < sCharArray.length - 1; i++) {
            getLongestPalindrome(sCharArray, i - 1, i + 1);
            getLongestPalindrome(sCharArray, i, i + 1);
        }

        return s.substring(start, end + 1);
    }

    private void getLongestPalindrome(char[] sCharArray, int left, int right) {
        while (left >= 0 && right < sCharArray.length) {
            if (sCharArray[left] != sCharArray[right]) {
                break;
            }
            left--;
            right++;
        }

        int len = right - left - 1;
        if (len > end - start + 1) {
            start = left + 1;
            end = right - 1;
        }
    }
}
