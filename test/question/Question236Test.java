package question;

import org.junit.Test;
import structure.TreeNode;

public class Question236Test {
    private final Question236 question236 = new Question236();

    @Test
    public void test1() {
        TreeNode root = TreeNode.listToTree(new Integer[]{3, 5, 1, 6, 2, 0, 8, null, null, 7, 4});
        assert root != null;
        TreeNode p = root.left;
        TreeNode q = root.right;
        System.out.println(question236.lowestCommonAncestor(root, p, q).val);
    }
}
