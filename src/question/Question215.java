package question;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Question215 {
    public int findKthLargest(int[] nums, int k) {
        List<Integer> list = new ArrayList<>(nums.length);
        for (int num : nums) {
            list.add(num);
        }

        return quickSelect(list, k);
    }

    private int quickSelect(List<Integer> list, int k) {
        Random random = new Random();
        int index = random.nextInt(list.size());
        Integer pivot = list.get(index);

        List<Integer> small = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> big = new ArrayList<>();

        list.forEach(l -> {
            if (l > pivot) {
                big.add(l);
            } else if (l < pivot) {
                small.add(l);
            } else {
                equal.add(l);
            }
        });

        if (big.size() >= k) {
            return quickSelect(big, k);
        } else if (list.size() - small.size() < k) {
            return quickSelect(small, k - big.size() - equal.size());
        } else {
            return pivot;
        }
    }
}
