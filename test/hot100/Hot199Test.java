package hot100;

import org.junit.Test;
import structure.TreeNode;

import java.util.Arrays;

public class Hot199Test {
    private final Hot199 hot199 = new Hot199();

    @Test
    public void test1() {
        TreeNode root = TreeNode.listToTree(Arrays.asList(1, 2, 3, null, 5, null, 4));

        System.out.println(hot199.rightSideView(root));
    }

    @Test
    public void test2() {
        TreeNode root = TreeNode.listToTree(Arrays.asList(1, null, 3));

        System.out.println(hot199.rightSideView(root));
    }

    @Test
    public void test3() {
        System.out.println(hot199.rightSideView(null));
    }
}
