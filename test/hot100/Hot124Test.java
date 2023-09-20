package hot100;

import org.junit.Test;
import structure.TreeNode;

public class Hot124Test {
    private final Hot124 hot124 = new Hot124();

    @Test
    public void test1() {
        TreeNode root = TreeNode.listToTree(new Integer[]{-10, 9, 20, null, null, 15, 7});
        System.out.println(hot124.maxPathSum(root));
    }

    @Test
    public void test2() {
        TreeNode root = TreeNode.listToTree(new Integer[]{1, 2, 3});
        System.out.println(hot124.maxPathSum(root));
    }

    @Test
    public void test3() {
        TreeNode root = TreeNode.listToTree(new Integer[]{-10, 9, null, 20, null, null, 15, 7});
        System.out.println(hot124.maxPathSum(root));
    }

    @Test
    public void test4() {
        TreeNode root = TreeNode.listToTree(new Integer[]{-10, 9, null, 20, null, 15, null, 7});
        System.out.println(hot124.maxPathSum(root));
    }
}
