package question;

import org.junit.Test;

import java.util.Arrays;

public class Question739Test {
    private final Question739 question739 = new Question739();

    @Test
    public void test1() {
        System.out.println(Arrays.toString(question739.dailyTemperatures(new int[]{73, 74, 75, 71, 69, 72, 76, 73})));
    }

    @Test
    public void test2() {
        System.out.println(Arrays.toString(question739.dailyTemperatures(new int[]{30, 40, 50, 60})));
    }

    @Test
    public void test3() {
        System.out.println(Arrays.toString(question739.dailyTemperatures(new int[]{30, 60, 90})));
    }
}
