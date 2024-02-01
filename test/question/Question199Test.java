package question;

import org.junit.Test;
import structure.TreeNode;

public class Question199Test {
    private final Question199 question199 = new Question199();

    @Test
    public void test1() {
        System.out.println(question199.rightSideView(TreeNode.listToTree(new Integer[]{1, 2, 3, null, 5, null, 4})));
    }

    @Test
    public void test2() {
        System.out.println(question199.rightSideView(TreeNode.listToTree(new Integer[]{1, null, 3})));
    }

    @Test
    public void test3() {
        System.out.println(question199.rightSideView(TreeNode.listToTree(new Integer[]{})));
    }
}
