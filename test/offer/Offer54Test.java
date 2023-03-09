package offer;

import org.junit.Test;
import structure.TreeNode;

public class Offer54Test {
    @Test
    public void Test1() {
        Offer54 offer54 = new Offer54();
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.right = new TreeNode(4);
        root.left.right = new TreeNode(2);
        System.out.println(offer54.kthLargest(root, 1));
    }

    @Test
    public void Test2() {
        Offer54 offer54 = new Offer54();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(1);
        System.out.println(offer54.kthLargest(root, 3));
    }

    @Test
    public void Test3() {
        Offer54 offer54 = new Offer54();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        System.out.println(offer54.kthLargest(root, 3));
    }
}
