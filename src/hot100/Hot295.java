package hot100;

public class Hot295 {
    static class Node<E> {
        E element;
        Node<E> prev;
        Node<E> next;

        public Node(E element, Node<E> prev, Node<E> next) {
            this.element = element;
            this.prev = prev;
            this.next = next;
        }
    }

    private static class MedianFinder {
        private Node<Integer> head;
        private Node<Integer> rear;
        private Node<Integer> left;
        private Node<Integer> right;

        // 初始化 MedianFinder 对象
        public MedianFinder() {

        }

        // 将数据流中的整数 num 添加到数据结构中
        public void addNum(int num) {
            if (head == null) {
                head = new Node<>(num, null, null);
                rear = head;
                left = head;
                right = head;
                return;
            }

            if (num <= head.element) {
                head.prev = new Node<>(num, null, head);
                head = head.prev;

                if (left == right) {
                    left = left.prev;
                } else {
                    right = right.prev;
                }

            } else if (num >= rear.element) {
                rear.next = new Node<>(num, rear, null);
                rear = rear.next;

                if (left == right) {
                    right = right.next;
                } else {
                    left = left.next;
                }
            } else if (num <= left.element) {
                Node<Integer> index = left.prev;
                while (index.element > num) {
                    index = index.prev;
                }

                Node<Integer> indexNext = index.next;
                index.next = new Node<>(num, index, indexNext);
                indexNext.prev = index.next;

                if (left == right) {
                    left = left.prev;
                } else {
                    right = right.prev;
                }
            } else if (num >= right.element) {
                Node<Integer> index = right.next;
                while (index.element < num) {
                    index = index.next;
                }

                Node<Integer> indexPrev = index.prev;
                index.prev = new Node<>(num, indexPrev, index);
                indexPrev.next = index.prev;

                if (left == right) {
                    right = right.next;
                } else {
                    left = left.next;
                }
            } else {
                left.next = new Node<>(num, left, right);
                right.prev = left.next;
                left = left.next;
                right = right.prev;
            }
        }

        // 返回到目前为止所有元素的中位数。与实际答案相差 10-5 以内的答案将被接受
        public double findMedian() {
            if (left == right) {
                return left.element;
            } else {
                return ((double) (left.element + right.element)) / 2;
            }
        }
    }

    private final MedianFinder medianFinder;

    public Hot295() {
        this.medianFinder = new MedianFinder();
    }

    public void addNum(int num) {
        this.medianFinder.addNum(num);
    }

    public double findMedian() {
        return this.medianFinder.findMedian();
    }
}
