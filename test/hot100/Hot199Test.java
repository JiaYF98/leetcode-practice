package hot100;

import org.junit.Test;
import structure.TreeNode;

public class Hot199Test {
    private final Hot199 hot199 = new Hot199();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(4);
        System.out.println(hot199.rightSideView(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(3);
        System.out.println(hot199.rightSideView(root));
    }

    @Test
    public void test3() {
        System.out.println(hot199.rightSideView(null));
    }
}
