package hot100;

import org.junit.Test;
import structure.TreeNode;

public class Hot437Test {
    private final Hot437 hot437 = new Hot437();

    @Test
    public void test1() {
        TreeNode root = TreeNode.listToTree(new Integer[]{10, 5, -3, 3, 2, null, 11, 3, -2, null, 1});

        System.out.println(hot437.pathSum(root, 8));
    }

    @Test
    public void test2() {
        TreeNode root = TreeNode.listToTree(new Integer[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1});

        System.out.println(hot437.pathSum(root, 22));
    }

    @Test
    public void test3() {
        TreeNode root = TreeNode.listToTree(new Integer[]{1000000000, 1000000000, null, 294967296, null, 1000000000, null, 1000000000, null, 1000000000});

        System.out.println(hot437.pathSum(root, 0));
    }
}
