package hot100;

import org.junit.Test;
import structure.TreeNode;

public class Hot114Test {
    private final Hot114 hot114 = new Hot114();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(5);
        root.right.right = new TreeNode(6);

        hot114.flatten(root);

        while (root != null) {
            System.out.println(root.val);
            root = root.right;
        }
    }

    @Test
    public void test2() {
        TreeNode root = null;
        hot114.flatten(root);
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(0);
        hot114.flatten(root);

        while (root != null) {
            System.out.println(root.val);
            root = root.right;
        }
    }
}
