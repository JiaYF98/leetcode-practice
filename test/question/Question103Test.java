package question;

import org.junit.Test;
import structure.TreeNode;

public class Question103Test {
    private final Question103 question103 = new Question103();

    @Test
    public void test1() {
        System.out.println(question103.zigzagLevelOrder(TreeNode.listToTree(new Integer[]{3, 9, 20, null, null, 15, 7})));
    }

    @Test
    public void test2() {
        System.out.println(question103.zigzagLevelOrder(TreeNode.listToTree(new Integer[]{1})));
    }

    @Test
    public void test3() {
        System.out.println(question103.zigzagLevelOrder(TreeNode.listToTree(new Integer[]{1, 2, 3, 4, null, null, 5})));
    }

    @Test
    public void test4() {
        System.out.println(question103.zigzagLevelOrder(TreeNode.listToTree(new Integer[]{0, 2, 4, 1, null, 3, -1, 5, 1, null, 6, null, 8})));
    }
}
