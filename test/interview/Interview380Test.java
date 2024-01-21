package interview;

import org.junit.Test;

public class Interview380Test {
    private final Interview380 interview380 = new Interview380();

    @Test
    public void test1() {
        System.out.println(interview380.insert(1));
        System.out.println(interview380.remove(2));
        System.out.println(interview380.insert(2));
        System.out.println(interview380.getRandom());
        System.out.println(interview380.remove(1));
        System.out.println(interview380.insert(2));
        System.out.println(interview380.getRandom());
    }
}
