package offer;

import org.junit.Test;
import structure.TreeNode;

public class Offer28Test {
    @Test
    public void Test1() {
        Offer28 offer28 = new Offer28();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);

        System.out.println(offer28.isSymmetric(root));
    }

    @Test
    public void Test2() {
        Offer28 offer28 = new Offer28();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);

        System.out.println(offer28.isSymmetric(root));
    }

    @Test
    public void Test3() {
        Offer28 offer28 = new Offer28();
        TreeNode root = new TreeNode(1);
        System.out.println(offer28.isSymmetric(root));
    }

    @Test
    public void Test4() {
        Offer28 offer28 = new Offer28();
        TreeNode root = null;
        System.out.println(offer28.isSymmetric(root));
    }

    @Test
    public void Test5() {
        Offer28 offer28 = new Offer28();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(4);
        root.left.left.left = new TreeNode(5);
        root.left.left.right = new TreeNode(6);
        root.left.right.left = new TreeNode(7);

        root.right = new TreeNode(2);
        root.right.left = new TreeNode(4);
        root.right.right = new TreeNode(3);
        root.right.right.left = new TreeNode(6);
        root.right.right.right = new TreeNode(5);


        System.out.println(offer28.isSymmetric(root));
    }
}
