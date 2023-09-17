package hot100;

import org.junit.Test;

public class Hot394Test {
    private final Hot394 hot394 = new Hot394();

    @Test
    public void test1() {
        System.out.println(hot394.decodeString("3[a]2[bc]"));
    }

    @Test
    public void test2() {
        System.out.println(hot394.decodeString("3[a2[c]]"));
    }

    @Test
    public void test3() {
        System.out.println(hot394.decodeString("2[abc]3[cd]ef"));
    }

    @Test
    public void test4() {
        System.out.println(hot394.decodeString("abc3[cd]xyz"));
    }
}
