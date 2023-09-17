package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hot22 {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        generateParenthesis(n, 0, result, new ArrayList<>(List.of(0)));
        return result;
    }

    private void generateParenthesis(int n, int s, List<String> result, List<Integer> pos) {
        if (pos.size() == n) {
            char[] subResult = new char[n * 2];
            Arrays.fill(subResult, ')');
            pos.forEach(p -> subResult[p] = '(');

            result.add(new String(subResult));
            return;
        }

        for (int i = s + 1; i < n * 2; i++) {
            if (i > pos.size() * 2) {
                return;
            }

            pos.add(i);
            generateParenthesis(n, i, result, pos);
            pos.remove(Integer.valueOf(i));
        }
    }
}
