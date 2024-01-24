package question;

import org.junit.Test;

public class Question146Test {
    private Question146 question146;

    @Test
    public void test1() {
        question146 = new Question146(2);
        question146.put(1, 1);
        question146.put(2, 2);
        question146.get(1);
        question146.put(3, 3);
        question146.get(2);
        question146.put(4, 4);
        question146.get(1);
        question146.get(3);
        question146.get(4);
    }

    @Test
    public void test2() {
        question146 = new Question146(2);
        question146.get(2);
        question146.put(2, 6);
        question146.get(1);
        question146.put(1, 5);
        question146.put(1, 2);
        question146.get(1);
        question146.get(2);
    }
}
