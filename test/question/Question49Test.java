package question;

import org.junit.Test;

public class Question49Test {
    private final Question49 question49 = new Question49();

    @Test
    public void test1() {
        System.out.println(question49.groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"}));
    }

    @Test
    public void test2() {
        System.out.println(question49.groupAnagrams(new String[]{""}));
    }

    @Test
    public void test3() {
        System.out.println(question49.groupAnagrams(new String[]{"a"}));
    }
}
