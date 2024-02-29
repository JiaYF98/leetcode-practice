package question;

import org.junit.Test;

public class Question232Test {
    @Test
    public void test1() {
        Question232 question232 = new Question232();
        question232.push(1);
        question232.push(2);
        System.out.println(question232.peek());
        System.out.println(question232.pop());
        System.out.println(question232.empty());
    }
}
