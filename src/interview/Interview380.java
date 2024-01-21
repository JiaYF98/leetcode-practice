package interview;

import java.util.*;

public class Interview380 {
    private final RandomizedSet randomizedSet = new RandomizedSet();

    private static class RandomizedSet {
        private final List<Integer> elements;
        private final Map<Integer, Integer> indices;
        private final Random random;


        public RandomizedSet() {
            elements = new ArrayList<>();
            indices = new HashMap<>();
            random = new Random();
        }

        public boolean insert(int val) {
            if (indices.containsKey(val)) {
                return false;
            }

            elements.add(val);
            indices.put(val, elements.size() - 1);
            return true;
        }

        public boolean remove(int val) {
            if (!indices.containsKey(val)) {
                return false;
            }

            Integer index = indices.get(val);
            Integer last = elements.get(elements.size() - 1);

            // 找到待删除元素，将列表中最后一个元素放到待删除元素位置，删除最后一个元素
            elements.set(index, last);
            elements.remove(elements.size() - 1);

            // map中删除已经删除的元素，调整list中交换位置的元素的位置
            indices.put(last, index);
            indices.remove(val);

            return true;
        }

        public int getRandom() {
            int index = random.nextInt(elements.size());
            return elements.get(index);
        }
    }

    public boolean insert(int val) {
        return randomizedSet.insert(val);
    }

    public boolean remove(int val) {
        return randomizedSet.remove(val);
    }

    public int getRandom() {
        return randomizedSet.getRandom();
    }
}
