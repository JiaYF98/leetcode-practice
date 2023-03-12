package offer;

import org.junit.Test;
import structure.TreeNode;

public class Offer55IITest {
    @Test
    public void Test1() {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        Offer55II offer55II = new Offer55II();
        System.out.println(offer55II.isBalanced(root));
    }

    @Test
    public void Test2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);
        root.left.left.left = new TreeNode(4);
        root.left.left.right = new TreeNode(4);
        Offer55II offer55II = new Offer55II();
        System.out.println(offer55II.isBalanced(root));
    }

    @Test
    public void Test3() {
        TreeNode root = new TreeNode(3);
        Offer55II offer55II = new Offer55II();
        System.out.println(offer55II.isBalanced(root));
    }

    @Test
    public void Test4() {
        Offer55II offer55II = new Offer55II();
        System.out.println(offer55II.isBalanced(null));
    }
}
