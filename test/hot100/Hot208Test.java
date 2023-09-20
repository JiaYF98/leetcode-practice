package hot100;

import org.junit.Test;

public class Hot208Test {
    private final Hot208 hot208 = new Hot208();

    @Test
    public void test1() {
        hot208.insert("apple");
        System.out.println(hot208.search("apple"));
        System.out.println(hot208.search("app"));
        System.out.println(hot208.startsWith("app"));
        hot208.insert("app");
        System.out.println(hot208.search("app"));
    }

    @Test
    public void test2() {
        hot208.insert("app");
        hot208.insert("apple");
        System.out.println(hot208.search("app"));
    }
}
