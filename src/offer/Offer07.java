package offer;

import structure.TreeNode;

public class Offer07 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = null;
        if (preorder.length > 0)
            root = build(root, preorder, 0, preorder.length - 1, inorder, 0, inorder.length - 1);
        return root;
    }

    private TreeNode build(TreeNode root, int[] preorder, int preorderStart, int preorderEnd, int[] inorder, int inorderStart, int inorderEnd) {
        root = new TreeNode(preorder[preorderStart]);
        int index = findRoot(inorder, inorderStart, inorderEnd, preorder[preorderStart]);

        int newPreorderLeftStart = preorderStart + 1;
        int newPreorderLeftEnd = index - inorderStart + preorderStart;
        int newPreorderRightStart = newPreorderLeftEnd + 1;
        int newInorderLeftEnd = index - 1;
        int newInorderRightStart = index + 1;

        if (newInorderLeftEnd - inorderStart >= 0)
            root.left = build(root.left, preorder, newPreorderLeftStart, newPreorderLeftEnd, inorder, inorderStart, newInorderLeftEnd);
        if (inorderEnd - newInorderRightStart >= 0)
            root.right = build(root.right, preorder, newPreorderRightStart, preorderEnd, inorder, newInorderRightStart, inorderEnd);

        return root;
    }

    private int findRoot(int[] inorder, int start, int end, int target) {
        for (int i = start; i <= end; i++) {
            if (inorder[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
