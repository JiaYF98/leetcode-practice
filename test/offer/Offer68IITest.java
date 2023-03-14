package offer;

import org.junit.Test;
import structure.TreeNode;

public class Offer68IITest {
    @Test
    public void Test1() {
        Offer68II offer68II = new Offer68II();
        TreeNode root = new TreeNode(3);
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);

        root.left = p;
        root.right = q;
        root.left.left = new TreeNode(6);
        root.left.right = new TreeNode(2);
        root.left.right.left = new TreeNode(7);
        root.left.right.right = new TreeNode(4);

        root.right.left = new TreeNode(0);
        root.right.right = new TreeNode(8);

        TreeNode treeNode = offer68II.lowestCommonAncestor(root, p, q);
        System.out.println(treeNode.val);
    }

    @Test
    public void Test2() {
        Offer68II offer68II = new Offer68II();
        TreeNode root = new TreeNode(1);
        TreeNode p = root;
        TreeNode q = new TreeNode(2);

        root.right = q;

        TreeNode treeNode = offer68II.lowestCommonAncestor(root, p, q);
        System.out.println(treeNode.val);
    }
}
