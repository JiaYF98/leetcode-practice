package offer;

import java.util.HashMap;
import java.util.Map;

public class Offer56II {
    public int singleNumber(int[] nums) {
        Map<Integer, Boolean> map = new HashMap<>();

        for (int num : nums) {
            if (map.containsKey(num)) {
                if (map.get(num))
                    map.replace(num, false);
                else
                    map.remove(num);
            } else {
                map.put(num, true);
            }
        }

        return (int) map.keySet().toArray()[0];
    }
}
