package offer;

import org.junit.Test;
import structure.TreeNode;

public class Offer55ITest {
    @Test
    public void Test1() {
        Offer55I offer55I = new Offer55I();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        System.out.println(offer55I.maxDepth(root));
    }

    @Test
    public void Test2() {
        Offer55I offer55I = new Offer55I();
        TreeNode root = new TreeNode(3);
        root.right = new TreeNode(20);
        root.right.right = new TreeNode(7);

        System.out.println(offer55I.maxDepth(root));
    }

    @Test
    public void Test3() {
        Offer55I offer55I = new Offer55I();

        System.out.println(offer55I.maxDepth(null));
    }
}
