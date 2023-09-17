package hot100;

import java.util.*;

class LRUCache {
    private final int capacity;

    // 标记
    private int count;

    // 数组两个值，第一个是value，第二个是标记
    private final Map<Integer, int[]> map = new HashMap<>(100000);

    // 两个值，第一个是key，第二个是key的标记
    private final Queue<int[]> queue = new ArrayDeque<>();

    public LRUCache(int capacity) {
        this.capacity = capacity;
    }

    public int get(int key) {
        int[] value = map.get(key);
        if (value == null) {
            return -1;
        }

        queue.offer(new int[]{key, count});
        map.put(key, new int[]{value[0], count++});
        return value[0];
    }

    public void put(int key, int value) {
        if (map.size() == capacity && !map.containsKey(key)) {
            while (!queue.isEmpty()) {
                int[] pop = queue.poll();
                int removeKey = pop[0];
                int removeCount = pop[1];
                if (map.getOrDefault(removeKey, new int[]{-1, -1})[1] == removeCount) {
                    map.remove(removeKey);
                    break;
                }
            }
        }
        queue.offer(new int[]{key, count});
        map.put(key, new int[]{value, count++});
    }
}

public class Hot146 {
    private final LRUCache lruCache;

    public Hot146(int capacity) {
        lruCache = new LRUCache(capacity);
    }

    public int get(int key) {
        return lruCache.get(key);
    }

    public void put(int key, int value) {
        lruCache.put(key, value);
    }
}
