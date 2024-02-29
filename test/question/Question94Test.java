package question;

import org.junit.Test;
import structure.TreeNode;

public class Question94Test {
    private final Question94 question94 = new Question94();

    @Test
    public void test1() {
        System.out.println(question94.inorderTraversal(TreeNode.listToTree(new Integer[]{1, null, 2, 3})));
    }

    @Test
    public void test2() {
        System.out.println(question94.inorderTraversal(TreeNode.listToTree(new Integer[]{})));
    }

    @Test
    public void test3() {
        System.out.println(question94.inorderTraversal(TreeNode.listToTree(new Integer[]{1})));
    }
}
