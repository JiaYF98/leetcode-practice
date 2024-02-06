package question;

import org.junit.Test;
import structure.TreeNode;

public class Question124Test {
    private final Question124 question124 = new Question124();

    @Test
    public void test1() {
        System.out.println(question124.maxPathSum(TreeNode.listToTree(new Integer[]{1, 2, 3})));
    }

    @Test
    public void test2() {
        System.out.println(question124.maxPathSum(TreeNode.listToTree(new Integer[]{-10, 9, 20, null, null, 15, 7})));
    }
}
