package hot100;

import structure.Node;

import java.util.*;

public class Hot138 {
    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }

        Map<Node, Integer> origin = new HashMap<>();
        Node originHead = head;
        int length = 0;
        while (originHead != null) {
            origin.put(originHead, length++);
            originHead = originHead.next;
        }

        // 构建复制链表
        Map<Integer, Node> copy = new HashMap<>();

        Node res = new Node(head.val);
        Node resHead = res;
        length = 0;
        copy.put(length++, res);

        originHead = head.next;
        while (originHead != null) {
            resHead.next = new Node(originHead.val);
            originHead = originHead.next;
            resHead = resHead.next;
            copy.put(length++, resHead);
        }

        // 设置链表的随机指针
        for (Map.Entry<Node, Integer> entry : origin.entrySet()) {
            // 当前原始节点
            Node originNode = entry.getKey();
            Integer originNodeNumber = entry.getValue();

            // 找到复制的节点
            Node copyNode = copy.get(originNodeNumber);

            // 根据原始节点的随机指针设置复制节点的随机指针
            Node originRandom = originNode.random;
            if (originRandom != null) {
                Integer originRandomNumber = origin.get(originRandom);
                copyNode.random = copy.get(originRandomNumber);
            }
        }

        return res;
    }
}
