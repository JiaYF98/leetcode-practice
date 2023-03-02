import offer.Offer27;
import org.junit.Test;
import structure.TreeNode;

import java.util.Deque;
import java.util.LinkedList;

public class Offer27Test {
    public void printTreeNode(TreeNode root) {
        Deque<TreeNode> deque = new LinkedList<>();
        deque.add(root);

        while (!deque.isEmpty()) {
            TreeNode pollNode = deque.poll();
            System.out.print(pollNode.val);
            if (pollNode.left != null) deque.add(pollNode.left);
            if (pollNode.right != null) deque.add(pollNode.right);
        }
    }

    @Test
    public void Test1() {
        Offer27 offer27 = new Offer27();
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(1);
        root.left.right = new TreeNode(3);
        root.right = new TreeNode(7);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(9);

        TreeNode mirrorTree = offer27.mirrorTree(root);

        printTreeNode(mirrorTree);
    }
}
