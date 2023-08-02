package hot100;

import org.junit.Test;
import structure.TreeNode;

public class Hot98Test {
    private final Hot98 hot98 = new Hot98();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(3);
        root.right.right = new TreeNode(6);

        System.out.println(hot98.isValidBST(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        System.out.println(hot98.isValidBST(root));
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(2);
        System.out.println(hot98.isValidBST(root));
    }
}
