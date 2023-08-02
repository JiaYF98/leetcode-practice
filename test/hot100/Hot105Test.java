package hot100;

import org.junit.Test;
import structure.TreeNode;

public class Hot105Test {
    private final Hot105 hot105 = new Hot105();

    @Test
    public void test1() {
        TreeNode root = hot105.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        System.out.println(root);
    }

    @Test
    public void test2() {
        TreeNode root = hot105.buildTree(new int[]{-1}, new int[]{-1});
        System.out.println(root);
    }

    @Test
    public void test3() {
        TreeNode root = hot105.buildTree(new int[]{1, 2, 3, 4, 5}, new int[]{5, 4, 3, 2, 1});
        System.out.println(root);
    }

    @Test
    public void test4() {
        TreeNode root = hot105.buildTree(new int[]{1, 2, 3, 4, 5}, new int[]{1, 2, 3, 4, 5});
        System.out.println(root);
    }
}
