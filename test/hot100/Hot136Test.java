package hot100;

import org.junit.Test;

public class Hot136Test {
    private final Hot136 hot136 = new Hot136();

    @Test
    public void test1() {
        System.out.println(hot136.singleNumber(new int[]{2, 2, 1}));
        System.out.println(hot136.singleNumber(new int[]{4,1,2,1,2}));
        System.out.println(hot136.singleNumber(new int[]{1}));
    }
}
