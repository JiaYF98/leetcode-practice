package hot100;

import org.junit.Test;

import java.util.List;

public class Hot46Test {
    private final Hot46 hot46 = new Hot46();

    @Test
    public void test1() {
        List<List<Integer>> permute = hot46.permute(new int[]{1, 2, 3});
        System.out.println("permute = " + permute);
    }

    @Test
    public void test2() {
        List<List<Integer>> permute = hot46.permute(new int[]{0, 1});
        System.out.println("permute = " + permute);
    }

    @Test
    public void test3() {
        List<List<Integer>> permute = hot46.permute(new int[]{1});
        System.out.println("permute = " + permute);
    }

    @Test
    public void test4() {
        List<List<Integer>> permute = hot46.permute(new int[]{1, 2, 3, 4, 5, 6});
        System.out.println("permute = " + permute);
    }
}
