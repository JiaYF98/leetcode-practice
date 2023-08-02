package hot100;

import java.util.ArrayList;
import java.util.List;

public class Hot78 {

    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        BackTracking(nums, 0, nums.length, new ArrayList<>(), res);
        return res;
    }

    private void BackTracking(int[] nums, int start, int end, List<Integer> list, List<List<Integer>> res) {
        res.add(new ArrayList<>(list));

        for (int i = start; i < end; i++) {
            list.add(nums[i]);
            BackTracking(nums, i + 1, end, list, res);
            list.remove(Integer.valueOf(nums[i]));
        }
    }
}
