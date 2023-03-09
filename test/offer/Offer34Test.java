package offer;

import org.junit.Test;
import structure.TreeNode;

public class Offer34Test {
    @Test
    public void Test1() {
        Offer34 offer34 = new Offer34();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(4);
        root.left.left = new TreeNode(11);
        root.left.left.left = new TreeNode(7);
        root.left.left.right = new TreeNode(2);
        root.right = new TreeNode(8);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(4);
        root.right.right.left = new TreeNode(5);
        root.right.right.right = new TreeNode(1);
        System.out.println(offer34.pathSum(root, 22));
    }

    @Test
    public void Test2() {
        Offer34 offer34 = new Offer34();
        System.out.println(offer34.pathSum(null, 5));
    }

    @Test
    public void Test3() {
        Offer34 offer34 = new Offer34();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        System.out.println(offer34.pathSum(root, 0));
    }

    @Test
    public void Test4() {
        Offer34 offer34 = new Offer34();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.right = new TreeNode(3);
        root.right.right.right = new TreeNode(4);
        System.out.println(offer34.pathSum(root, 10));
        System.out.println(offer34.pathSum(root, 12));
    }

    @Test
    public void Test5() {
        Offer34 offer34 = new Offer34();
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        System.out.println(offer34.pathSum(root, 1));
    }
}
