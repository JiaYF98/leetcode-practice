package hot100;

import org.junit.Test;

public class Hot50Test {
    @Test
    public void Test1() {
        Hot50 hot50 = new Hot50();
        System.out.println(hot50.myPow(2.00000, 10));
        System.out.println(hot50.myPow(2.10000, 3));
        System.out.println(hot50.myPow(2.00000, -2));
    }
}
