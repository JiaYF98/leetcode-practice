package hot100;

import org.junit.Test;
import structure.TreeNode;

public class Hot543Test {
    private final Hot543 hot543 = new Hot543();

    @Test
    public void test1() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.left.left = new TreeNode(6);
        root.left.left.left.left = new TreeNode(8);
        root.left.right = new TreeNode(5);
        root.left.right.right = new TreeNode(7);
        root.left.right.right.right = new TreeNode(9);
        root.right = new TreeNode(3);
        int diameter = hot543.diameterOfBinaryTree(root);
        System.out.println("diameter = " + diameter);
    }

    @Test
    public void test2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        int diameter = hot543.diameterOfBinaryTree(root);
        System.out.println("diameter = " + diameter);
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.right = new TreeNode(3);
        int diameter = hot543.diameterOfBinaryTree(root);
        System.out.println("diameter = " + diameter);
    }
}
