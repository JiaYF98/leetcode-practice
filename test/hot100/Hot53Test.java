package hot100;

import org.junit.Test;

public class Hot53Test {
    @Test
    public void Test1() {
        Hot53 hot53 = new Hot53();
        System.out.println(hot53.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        System.out.println(hot53.maxSubArray(new int[]{1}));
        System.out.println(hot53.maxSubArray(new int[]{5, 4, -1, 7, 8}));
    }
}
