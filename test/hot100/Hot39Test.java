package hot100;

import org.junit.Test;

public class Hot39Test {
    private final Hot39 hot39 = new Hot39();

    @Test
    public void test1() {
        System.out.println("hot39.combinationSum(new int[]{2, 3, 6, 7}, 7) = " + hot39.combinationSum(new int[]{2, 3, 6, 7}, 7));
        System.out.println("hot39.combinationSum(new int[]{2, 3, 5}, 8) = " + hot39.combinationSum(new int[]{2, 3, 5}, 8));
        System.out.println("hot39.combinationSum(new int[]{2}, 1) = " + hot39.combinationSum(new int[]{2}, 1));
    }
}
