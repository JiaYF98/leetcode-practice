package question;

import org.junit.Test;
import structure.TreeNode;

public class Question102Test {
    private final Question102 question102 = new Question102();

    @Test
    public void test1() {
        System.out.println(question102.levelOrder(TreeNode.listToTree(new Integer[]{3, 9, 20, null, null, 15, 7})));
    }

    @Test
    public void test2() {
        System.out.println(question102.levelOrder(TreeNode.listToTree(new Integer[]{1})));
    }

    @Test
    public void test3() {
        System.out.println(question102.levelOrder(TreeNode.listToTree(new Integer[]{})));
    }
}
