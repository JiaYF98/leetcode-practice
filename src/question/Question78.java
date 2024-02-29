package question;

import java.util.ArrayList;
import java.util.List;

public class Question78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i <= nums.length; i++) {
            getSub(res, numsList, new ArrayList<>(), i);
        }

        return res;
    }

    private void getSub(List<List<Integer>> res, List<Integer> numsList, List<Integer> subSet, int need) {
        if (numsList.size() < need) {
            return;
        }

        if (need == 0) {
            res.add(new ArrayList<>(subSet));
            return;
        }

        int size = numsList.size();
        for (int i = 0; i < size; i++) {
            Integer curr = numsList.get(i);
            subSet.add(curr);
            List<Integer> temp = new ArrayList<>();
            for (int j = i + 1; j < size; j++) {
                temp.add(numsList.get(j));
            }
            getSub(res, temp, subSet, need - 1);
            subSet.remove(curr);
        }
    }
}
