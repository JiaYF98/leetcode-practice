package offer;

import org.junit.Test;

public class Interview61Test {
    @Test
    public void Test1() {
        Interview61 interview61 = new Interview61();
        System.out.println(interview61.isStraight(new int[]{1, 2, 3, 4, 5}));
        System.out.println(interview61.isStraight(new int[]{0, 0, 1, 2, 5}));
        System.out.println(interview61.isStraight(new int[]{0, 1, 2, 3, 5}));
        System.out.println(interview61.isStraight(new int[]{0, 1, 2, 3, 6}));
        System.out.println(interview61.isStraight(new int[]{0, 0, 2, 3, 7}));
        System.out.println(interview61.isStraight(new int[]{0, 0, 2, 3, 6}));
        System.out.println(interview61.isStraight(new int[]{0, 0, 11, 12, 13}));
        System.out.println(interview61.isStraight(new int[]{0, 0, 10, 12, 13}));
        System.out.println(interview61.isStraight(new int[]{0, 0, 9, 12, 13}));
        System.out.println(interview61.isStraight(new int[]{0, 0, 8, 12, 13}));
        System.out.println(interview61.isStraight(new int[]{0, 9, 10, 12, 13}));
        System.out.println(interview61.isStraight(new int[]{0, 0, 0, 0, 0}));
        System.out.println(interview61.isStraight(new int[]{0, 0, 2, 2, 5}));
    }
}
