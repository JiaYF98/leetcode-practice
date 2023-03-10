package hot100;

import org.junit.Test;

public class Hot33Test {
    @Test
    public void Test1() {
        Hot33 hot33 = new Hot33();
        System.out.println(hot33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 0));
        System.out.println(hot33.search(new int[]{4, 5, 6, 7, 0, 1, 2}, 8));
        System.out.println(hot33.search(new int[]{1}, 0));
        System.out.println(hot33.search(new int[]{1}, 1));
        System.out.println(hot33.search(new int[]{1, 2, 3, 4, 5}, 1));
        System.out.println(hot33.search(new int[]{1, 2, 3, 4, 5}, 5));
        System.out.println(hot33.search(new int[]{1, 2, 3, 4, 5}, 6));
        System.out.println(hot33.search(new int[]{1, 2, 3, 4, 5}, 0));
    }
}
