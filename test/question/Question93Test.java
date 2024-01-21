package question;

import org.junit.Test;

public class Question93Test {
    private final Question93 question93 = new Question93();

    @Test
    public void test1() {
        System.out.println(question93.restoreIpAddresses("25525511135"));
    }

    @Test
    public void test2() {
        System.out.println(question93.restoreIpAddresses("0000"));
    }

    @Test
    public void test3() {
        System.out.println(question93.restoreIpAddresses("101023"));
    }

    @Test
    public void test4() {
        System.out.println(question93.restoreIpAddresses("255255255255"));
    }

    @Test
    public void test5() {
        System.out.println(question93.restoreIpAddresses("02852"));
    }
}
