package hot100;

import structure.TreeNode;

public class Hot543 {
    private int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        getDepth(root);
        return diameter;
    }

    private int getDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftDepth = getDepth(root.left);
        int rightDepth = getDepth(root.right);

        if (leftDepth + rightDepth > diameter) {
            diameter = leftDepth + rightDepth;
        }

        return Math.max(leftDepth, rightDepth) + 1;
    }
}
