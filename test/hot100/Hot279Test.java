package hot100;

import org.junit.Test;

public class Hot279Test {
    private final Hot279 hot279 = new Hot279();

    @Test
    public void test1() {
        System.out.println("hot279.numSquares(12) = " + hot279.numSquares(12));
        System.out.println("hot279.numSquares(13) = " + hot279.numSquares(13));
        System.out.println("hot279.numSquares(1) = " + hot279.numSquares(1));
        System.out.println("hot279.numSquares(10000) = " + hot279.numSquares(10000));
        System.out.println("hot279.numSquares(9999) = " + hot279.numSquares(9999));
        System.out.println("hot279.numSquares(25) = " + hot279.numSquares(25));
    }
}
