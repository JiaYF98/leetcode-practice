package hot100;

import java.util.HashMap;
import java.util.Map;

public class Hot347 {
    public static class ElementCount {
        int element;
        int count;

        public ElementCount(int element, int count) {
            this.element = element;
            this.count = count;
        }
    }

    public int[] topKFrequent(int[] nums, int k) {
        ElementCount[] elementCounts = getElementCounts(nums);
        buildHeap(elementCounts);

        int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = elementCounts[0].element;
            swap(elementCounts, 0, elementCounts.length - 1 - i);
            if (i < k - 1) {
                adjust(elementCounts, 0, elementCounts.length - 2 - i);
            }
        }

        return res;
    }

    private ElementCount[] getElementCounts(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        ElementCount[] elementCounts = new ElementCount[map.size()];
        int count = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            elementCounts[count++] = new ElementCount(entry.getKey(), entry.getValue());
        }

        return elementCounts;
    }

    private void buildHeap(ElementCount[] elementCounts) {
        int startIndex = elementCounts.length / 2 - 1;

        for (int i = startIndex; i >= 0; i--) {
            int rChild = (i + 1) * 2;
            int lChild = rChild - 1;

            int j = rChild == elementCounts.length ? lChild : elementCounts[lChild].count > elementCounts[rChild].count ? lChild : rChild;
            if (elementCounts[i].count < elementCounts[j].count) {
                swap(elementCounts, i, j);
                adjust(elementCounts, j, elementCounts.length - 1);
            }
        }
    }

    private void swap(ElementCount[] elementCounts, int i, int j) {
        ElementCount temp = elementCounts[i];
        elementCounts[i] = elementCounts[j];
        elementCounts[j] = temp;
    }

    private void adjust(ElementCount[] elementCounts, int start, int end) {
        int i = start;
        while (i <= (end + 1) / 2 - 1) {
            int rChild = (i + 1) * 2;
            int lChild = rChild - 1;

            int j = rChild <= end ? (elementCounts[lChild].count > elementCounts[rChild].count ? lChild : rChild) : (lChild <= end ? lChild : i);
            if (elementCounts[j].count > elementCounts[i].count) {
                swap(elementCounts, i, j);
            }

            i = j;
        }
    }
}
