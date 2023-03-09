package offer;

import org.junit.Test;
import structure.TreeNode;

public class Offer36Test {
    @Test
    public void Test1() {
        Offer36 offer36 = new Offer36();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(5);

        TreeNode node = offer36.treeToDoublyList(root);
        TreeNode tmp = node;
        System.out.print(tmp.val);
        tmp = tmp.right;
        while (tmp != node) {
            System.out.print("->" + tmp.val);
            tmp = tmp.right;
        }
    }

    @Test
    public void Test2() {
        Offer36 offer36 = new Offer36();
        TreeNode root = new TreeNode(1);

        TreeNode node = offer36.treeToDoublyList(root);
        TreeNode tmp = node;
        System.out.print(tmp.val);
        tmp = tmp.right;
        while (tmp != node) {
            System.out.print("->" + tmp.val);
            tmp = tmp.right;
        }
    }

    @Test
    public void Test3() {
        Offer36 offer36 = new Offer36();
        TreeNode root = null;

        TreeNode node = offer36.treeToDoublyList(root);
        if (node == null) {
            System.out.println("null");
            return;
        }

        TreeNode tmp = node;
        System.out.print(tmp.val);
        tmp = tmp.right;
        while (tmp != node) {
            System.out.print("->" + tmp.val);
            tmp = tmp.right;
        }
    }
}
