package offer;

import org.junit.Test;

public class Interview45Test {
    @Test
    public void Test1() {
        Interview45 interview45 = new Interview45();
        System.out.println(interview45.minNumber(new int[]{3, 30, 34, 5, 9}));
        System.out.println(interview45.minNumber(new int[]{10, 2}));
        System.out.println(interview45.minNumber(new int[]{100000, 10, 2, 2000, 3000, 22}));
        System.out.println(interview45.minNumber(new int[]{0, 10, 2, 2000, 3000, 22}));
        System.out.println(interview45.minNumber(new int[]{824, 8247}));
        System.out.println(interview45.minNumber(new int[]{12, 121}));
        System.out.println(interview45.minNumber(new int[]{62, 626}));
    }
}
