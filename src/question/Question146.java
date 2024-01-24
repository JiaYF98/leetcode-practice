package question;

import java.util.HashMap;
import java.util.Map;

public class Question146 {
    private final LRUCache lruCache;

    public Question146(int capacity) {
        lruCache = new LRUCache(capacity);
    }

    public void put(int key, int value) {
        lruCache.put(key, value);
        lruCache.print();
    }

    public void get(int key) {
        System.out.println("返回 " + lruCache.get(key));
    }

    private static class LRUCache {
        private final int capacity;

        // elements中的value是关键字在order中存放的位置
        private final Map<Integer, TwoWayNode> elements;

        private TwoWayNode first;

        private TwoWayNode last;

        LRUCache(int capacity) {
            this.capacity = capacity;
            elements = new HashMap<>(capacity);
        }

        public int get(int key) {
            TwoWayNode index = elements.get(key);
            if (index == null) {
                return -1;
            } else {
                int value = index.val;
                refresh(index, value);
                return value;
            }
        }

        // 将该key放到最后面
        private void refresh(TwoWayNode index, int value) {
            // 刷新说明至少存在一个元素
            // 如果是最后一个元素，即只有一个元素 则只需要更新值
            if (index == last) {
                last.val = value;
                return;
            } else if (index == first) {
                // 如果是第一个元素 则需要将开始指针往后移动
                first = first.next;
                first.prv = null;
            } else {
                TwoWayNode prv = index.prv;
                TwoWayNode next = index.next;
                prv.next = next;
                next.prv = prv;
            }

            insertToEnd(index.key, value);
        }

        // 在最后面插入元素
        private void insertToEnd(int key, int value) {
            if (last == null) {
                last = new TwoWayNode(key, value, null, null);
                first = last;
            } else {
                last.next = new TwoWayNode(key, value, last, null);
                last = last.next;
            }

            // 添加新元素
            elements.put(key, last);
        }

        public void put(int key, int value) {
            // 如果已经存在key
            if (elements.containsKey(key)) {
                TwoWayNode index = elements.get(key);
                // 将该关键字放到后面
                refresh(index, value);
                return;
            }

            // 如果不存在key
            if (elements.size() == capacity) {
                deleteLRUElement();
            }

            // 往最后插入元素
            insertToEnd(key, value);
        }

        // 删除最久未使用的元素
        private void deleteLRUElement() {
            int firstKey = first.key;
            elements.remove(firstKey);
            if (first == last) {
                // 只有一个元素
                last = null;
            } else {
                // 有两个及以上的元素
                first = first.next;
                first.prv = null;
            }
        }

        private static class TwoWayNode {
            int key;
            int val;
            TwoWayNode prv;
            TwoWayNode next;

            TwoWayNode(int key, int val, TwoWayNode prv, TwoWayNode next) {
                this.key = key;
                this.val = val;
                this.prv = prv;
                this.next = next;
            }
        }

        public void print() {
            TwoWayNode index = first;

            System.out.print("缓存是 {");

            while (index.next != null) {
                System.out.print(index.key + "=" + index.val + ", ");
                index = index.next;
            }

            System.out.println(index.key + "=" + index.val + "}");
        }
    }
}
