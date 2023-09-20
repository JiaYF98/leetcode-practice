package hot100;

import org.junit.Test;
import structure.TreeNode;

public class Hot543Test {
    private final Hot543 hot543 = new Hot543();

    @Test
    public void test1() {
        TreeNode root = TreeNode.listToTree(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9});

        int diameter = hot543.diameterOfBinaryTree(root);
        System.out.println("diameter = " + diameter);
    }

    @Test
    public void test2() {
        TreeNode root = TreeNode.listToTree(new Integer[]{1, 2});

        int diameter = hot543.diameterOfBinaryTree(root);
        System.out.println("diameter = " + diameter);
    }

    @Test
    public void test3() {
        TreeNode root = TreeNode.listToTree(new Integer[]{1, 2, 3, 4, 5});

        int diameter = hot543.diameterOfBinaryTree(root);
        System.out.println("diameter = " + diameter);
    }
}
