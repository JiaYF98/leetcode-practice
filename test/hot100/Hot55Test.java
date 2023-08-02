package hot100;

import org.junit.Test;

public class Hot55Test {
    private final Hot55 hot55 = new Hot55();

    @Test
    public void test1() {
        System.out.println("hot55.canJump(new int[]{2, 3, 1, 1, 4}) = " + hot55.canJump(new int[]{2, 3, 1, 1, 4}));
        System.out.println("hot55.canJump(new int[]{3, 2, 1, 0, 4}) = " + hot55.canJump(new int[]{3, 2, 1, 0, 4}));
    }
}
