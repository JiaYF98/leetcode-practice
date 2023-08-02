package hot100;

import org.junit.Test;
import structure.TreeNode;

public class Hot230Test {
    private final Hot230 hot230 = new Hot230();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.right = new TreeNode(2);
        root.right = new TreeNode(4);
        System.out.println(hot230.kthSmallest(root, 1));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.left.left = new TreeNode(2);
        root.left.left.left = new TreeNode(1);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(6);
        System.out.println(hot230.kthSmallest(root, 3));
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(1);
        System.out.println(hot230.kthSmallest(root, 1));
    }
}
