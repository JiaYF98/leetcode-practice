package hot100;

import java.util.ArrayList;
import java.util.List;

public class Hot46 {
    private final List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        Backtracking(new ArrayList<>(), nums, new boolean[nums.length]);
        return res;
    }

    private void Backtracking(List<Integer> list, int[] nums, boolean[] used) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            list.add(nums[i]);
            used[i] = true;
            Backtracking(list, nums, used);
            list.remove(Integer.valueOf(nums[i]));
            used[i] = false;
        }
    }

}
