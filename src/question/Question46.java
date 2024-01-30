package question;

import java.util.ArrayList;
import java.util.List;

public class Question46 {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> numbers = new ArrayList<>();
        for (int num : nums) {
            numbers.add(num);
        }

        List<List<Integer>> res = new ArrayList<>();
        backTracing(numbers, new ArrayList<>(), res);

        return res;
    }

    private void backTracing(List<Integer> numbers, ArrayList<Integer> list, List<List<Integer>> res) {
        if (numbers.isEmpty()) {
            res.add(new ArrayList<>(list));
        }

        for (int i = 0; i < numbers.size(); i++) {
            Integer currentNum = numbers.remove(i);
            list.add(currentNum);
            backTracing(numbers, list, res);
            list.remove(currentNum);
            numbers.add(i, currentNum);
        }
    }
}
