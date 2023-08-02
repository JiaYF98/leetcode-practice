package hot100;

import java.util.HashMap;

public class Hot560 {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int pre = 0;

        HashMap<Integer, Integer> mp = new HashMap<>();
        mp.put(0, 1);

        for (int num : nums) {
            pre += num;
            if (mp.containsKey(pre - k)) {
                count += mp.get(pre - k);
            }
            mp.put(pre, mp.getOrDefault(pre, 0) + 1);
        }

        return count;
    }
}
