package offer;

import structure.TreeNode;

public class Offer27 {
    private void swapTreeNode(TreeNode node) {
        if (node == null) {
            return;
        }

        swapTreeNode(node.left);
        swapTreeNode(node.right);

        TreeNode tmp = node.left;
        node.left = node.right;
        node.right = tmp;
    }

    public TreeNode mirrorTree(TreeNode root) {
        swapTreeNode(root);
        return root;
    }

    public TreeNode mirrorTree2(TreeNode root) {
        if (root == null) return null;

        TreeNode leftRoot = mirrorTree(root.right);
        TreeNode rightRoot = mirrorTree(root.left);

        root.left = leftRoot;
        root.right = rightRoot;

        return root;
    }
}
