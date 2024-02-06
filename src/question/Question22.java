package question;

import java.util.ArrayList;
import java.util.List;

public class Question22 {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateParenthesis("", n, n, res);
        return res;
    }

    private void generateParenthesis(String s, int left, int right, List<String> res) {
        if (left == 0 && right == 0) {
            res.add(s);
            return;
        }

        if (left == right) {
            generateParenthesis(s + "(", left - 1, right, res);
        } else if (left < right) {
            if (left > 0) {
                generateParenthesis(s + "(", left - 1, right, res);
            }
            generateParenthesis(s + ")", left, right - 1, res);
        }
    }
}
