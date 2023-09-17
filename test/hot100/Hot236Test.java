package hot100;

import org.junit.Test;
import structure.TreeNode;

import java.util.Arrays;

public class Hot236Test {
    private final Hot236 hot236 = new Hot236();

    @Test
    public void test1() {
        TreeNode root = TreeNode.listToTree(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));

        TreeNode p = root.left;
        TreeNode q = root.right;
        System.out.println(hot236.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    public void test2() {
        TreeNode root = TreeNode.listToTree(Arrays.asList(3, 5, 1, 6, 2, 0, 8, null, null, 7, 4));

        TreeNode p = root.left;
        TreeNode q = root.left.right.right;
        System.out.println(hot236.lowestCommonAncestor(root, p, q).val);
    }

    @Test
    public void test3() {
        TreeNode root = TreeNode.listToTree(Arrays.asList(1, 2));
        TreeNode q = root.left;
        System.out.println(hot236.lowestCommonAncestor(root, root, q).val);
    }

    @Test
    public void test4() {
        TreeNode root = TreeNode.listToTree(Arrays.asList(1, 2, 3));
        System.out.println(hot236.lowestCommonAncestor(root, root.right, root.left).val);
    }
}
