package offer;

import org.junit.Test;
import structure.TreeNode;

public class Offer68ITest {
    @Test
    public void Test1() {
        Offer68I offer68I = new Offer68I();
        TreeNode root = new TreeNode(6);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(8);
        root.left = p;
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(4);
        root.left.right.left = new TreeNode(3);
        root.left.right.right = new TreeNode(5);
        root.right = q;
        root.right.left = new TreeNode(7);
        root.right.right = new TreeNode(9);

        TreeNode treeNode = offer68I.lowestCommonAncestor(root, p, q);
        System.out.println(treeNode.val);
    }
}
