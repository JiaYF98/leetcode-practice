package hot100;

import org.junit.Test;

import java.util.List;

public class Hot49Test {
    @Test
    public void test1() {
        Hot49 hot49 = new Hot49();
        List<List<String>> lists = hot49.groupAnagrams(new String[]{""});
    }
}
