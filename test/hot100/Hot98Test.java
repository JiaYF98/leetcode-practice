package hot100;

import org.junit.Test;
import structure.TreeNode;

import java.util.Arrays;

public class Hot98Test {
    private final Hot98 hot98 = new Hot98();

    @Test
    public void test1() {
        TreeNode root = TreeNode.listToTree(Arrays.asList(5, 1, 4, 3, 6));

        System.out.println(hot98.isValidBST(root));
    }

    @Test
    public void test2() {
        TreeNode root = TreeNode.listToTree(Arrays.asList(2, 1, 3));

        System.out.println(hot98.isValidBST(root));
    }

    @Test
    public void test3() {
        TreeNode root = new TreeNode(2);
        System.out.println(hot98.isValidBST(root));
    }
}
