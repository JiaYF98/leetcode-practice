package offer;

import org.junit.Test;

public class Offer12Test {
    @Test
    public void Test1() {
        Offer12 offer12 = new Offer12();
        System.out.println(offer12.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S','F','C','S'}}, "ABCCED"));
    }
}
