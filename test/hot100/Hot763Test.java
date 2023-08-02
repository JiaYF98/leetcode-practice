package hot100;

import org.junit.Test;

import java.util.List;

public class Hot763Test {
    private final Hot763 hot763 = new Hot763();

    @Test
    public void test1() {
        List<Integer> list = hot763.partitionLabels("ababcbacadefegdehijhklij");
        System.out.println("list = " + list);
    }

    @Test
    public void test2() {
        List<Integer> list = hot763.partitionLabels("eccbbbbdec");
        System.out.println("list = " + list);
    }
}
