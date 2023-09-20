package hot100;

import java.util.ArrayList;
import java.util.List;

public class Hot131 {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<>();

        backtracking(result, s.toCharArray(), 0, new ArrayList<>());

        return result;
    }

    private void backtracking(List<List<String>> results, char[] charArray, int start, List<String> result) {
        if (start == charArray.length) {
            results.add(new ArrayList<>(result));
            return;
        }

        for (int i = start; i < charArray.length; i++) {
            if (isPalindrome(charArray, start, i)) {
                result.add(new String(charArray, start, i - start + 1));
                backtracking(results, charArray, i + 1, result);
                result.remove(result.size() - 1);
            }
        }
    }

    private boolean isPalindrome(char[] charArray, int start, int end) {
        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }

        return true;
    }
}
