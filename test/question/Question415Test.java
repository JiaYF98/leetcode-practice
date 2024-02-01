package question;

import org.junit.Test;

public class Question415Test {
    private final Question415 question415 = new Question415();

    @Test
    public void test1() {
        System.out.println(question415.addStrings("11", "123"));
    }

    @Test
    public void test2() {
        System.out.println(question415.addStrings("456", "77"));
    }

    @Test
    public void test3() {
        System.out.println(question415.addStrings("0", "0"));
    }
}
