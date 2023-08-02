package hot100;

import structure.TreeNode;

import java.util.Stack;

public class Hot114 {
    public void flatten(TreeNode root) {
        if (root == null) {
            return;
        }

        Stack<TreeNode> stack = new Stack<>();
        flatten(root, stack);

        while (stack.size() > 1) {
            TreeNode pop = stack.pop();
            TreeNode peek = stack.peek();
            peek.left = null;
            peek.right = pop;
        }
        root.left = null;
    }

    private void flatten(TreeNode root, Stack<TreeNode> stack) {
        if (root == null) {
            return;
        }

        stack.push(root);
        flatten(root.left, stack);
        flatten(root.right, stack);
    }
}
