package hot100;

import org.junit.Test;
import structure.Node;

import java.util.ArrayList;

public class Hot138Test {
    private final Hot138 hot138 = new Hot138();

    @Test
    public void test1() {
        Node head = new Node(7);
        head.next = new Node(13);
        head.random = null;
        head.next.next = new Node(11);
        head.next.random = head;
        head.next.next.next = new Node(10);
        head.next.next.next.next = new Node(1);
        head.next.next.random = head.next.next.next.next;
        head.next.next.next.random = head.next.next;
        head.next.next.next.next.next = null;
        head.next.next.next.next.random = head;
        Node node = hot138.copyRandomList(head);
        System.out.println(node);
    }
}
