package offer;

import structure.Node;

import java.util.HashMap;
import java.util.Map;

public class Offer35 {
    public Node copyRandomList(Node head) {

        if (head == null) {
            return null;
        }

        Map<Integer, Node> originMap1 = new HashMap<>();    // 根据序号找到 structure.Node
        Map<Node, Integer> originMap2 = new HashMap<>();    // 根据 structure.Node 找到序号
        int count = 0;

        while (head != null) {
            originMap1.put(count, head);
            originMap2.put(head, count);
            count++;
            head = head.next;
        }

        Map<Integer, Node> copyMap = new HashMap<>();

        for (Map.Entry<Integer, Node> entry : originMap1.entrySet()) {
            copyMap.put(entry.getKey(), new Node(entry.getValue().val));
        }

        int nodeSize = originMap1.size();

        for (int i = 0; i < nodeSize; i++) {
            // 找到 next
            if (i < nodeSize - 1) {
                copyMap.get(i).next = copyMap.get(i + 1);
            }

            // 找到 random
            Node randomNode = originMap1.get(i).random;

            if (randomNode != null) {
                int randomKey = originMap2.get(randomNode);
                copyMap.get(i).random = copyMap.get(randomKey);
            }
        }

        return copyMap.get(0);
    }
}
