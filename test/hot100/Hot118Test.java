package hot100;

import org.junit.Test;

import java.util.List;

public class Hot118Test {
    private final Hot118 hot118 = new Hot118();

    @Test
    public void test1() {
        List<List<Integer>> generate = hot118.generate(1);
        System.out.println("generate = " + generate);
    }

    @Test
    public void test2() {
        List<List<Integer>> generate = hot118.generate(2);
        System.out.println("generate = " + generate);
    }

    @Test
    public void test3() {
        List<List<Integer>> generate = hot118.generate(5);
        System.out.println("generate = " + generate);
    }

    @Test
    public void test4() {
        List<List<Integer>> generate = hot118.generate(30);
        System.out.println("generate = " + generate);
    }
}
