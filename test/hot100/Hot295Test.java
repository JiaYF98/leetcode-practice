package hot100;

import org.junit.Test;

public class Hot295Test {
    private final Hot295 hot295 = new Hot295();

    @Test
    public void test1() {
        hot295.addNum(1);
        hot295.addNum(2);
        System.out.println(hot295.findMedian());
        hot295.addNum(3);
        System.out.println(hot295.findMedian());
    }

    @Test
    public void test2() {
        hot295.addNum(1513);
        hot295.addNum(5083);
        System.out.println(hot295.findMedian());
        hot295.addNum(4386);
        System.out.println(hot295.findMedian());
        hot295.addNum(2296);
        System.out.println(hot295.findMedian());
    }
}
