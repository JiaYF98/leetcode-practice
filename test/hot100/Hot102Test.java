package hot100;

import org.junit.Test;
import structure.TreeNode;

public class Hot102Test {
    private final Hot102 hot102 = new Hot102();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        System.out.println(hot102.levelOrder(root));
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);
        System.out.println(hot102.levelOrder(root));
    }

    @Test
    public void test3() {
        System.out.println(hot102.levelOrder(null));
    }
}
