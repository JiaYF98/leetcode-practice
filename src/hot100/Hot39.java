package hot100;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hot39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(candidates);
        Backtracking(candidates, 0, 0, target, new ArrayList<>(), res);
        return res;
    }

    private void Backtracking(int[] candidates, int sum, int start, int target, List<Integer> list, List<List<Integer>> res) {
        if (sum == target) {
            res.add(new ArrayList<>(list));
            return;
        }

        while (start < candidates.length) {
            sum += candidates[start];
            if (sum > target) {
                break;
            }
            list.add(candidates[start]);
            Backtracking(candidates, sum, start, target, list, res);
            list.remove(Integer.valueOf(candidates[start]));
            sum -= candidates[start];
            start++;
        }
    }
}
