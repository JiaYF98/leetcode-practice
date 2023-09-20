package hot100;

import org.junit.Test;
import structure.TreeNode;

public class Hot230Test {
    private final Hot230 hot230 = new Hot230();

    @Test
    public void test1() {
        TreeNode root = TreeNode.listToTree(new Integer[]{3, 1, 4, null, 2});

        System.out.println(hot230.kthSmallest(root, 1));
    }

    @Test
    public void test2() {
        TreeNode root = TreeNode.listToTree(new Integer[]{5, 3, 6, 2, 4, null, null, 1});

        System.out.println(hot230.kthSmallest(root, 3));
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(1);
        System.out.println(hot230.kthSmallest(root, 1));
    }
}
