package question;

import org.junit.Test;

public class Question200Test {
    private final Question200 question200 = new Question200();

    @Test
    public void test1() {
        System.out.println(question200.numIslands(new char[][]{
                {'1', '1', '1', '1', '0'},
                {'1', '1', '0', '1', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '0', '0', '0'}
        }));
    }

    @Test
    public void test2() {
        System.out.println(question200.numIslands(new char[][]{
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        }));
    }
}
