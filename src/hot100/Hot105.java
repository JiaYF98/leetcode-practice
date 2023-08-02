package hot100;

import structure.TreeNode;

public class Hot105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return buildTree(preorder, 0, preorder.length - 1, inorder, 0, preorder.length - 1);
    }

    private TreeNode buildTree(int[] preorder, int ps, int pe, int[] inorder, int is, int ie) {
        if (ps <= pe) {
            TreeNode root = new TreeNode(preorder[ps]);
            int index = 0;
            for (int i = is; i <= ie; i++) {
                if (inorder[i] == preorder[ps]) {
                    index = i - is;
                    break;
                }
            }
            root.left = buildTree(preorder, ps + 1, ps + index, inorder, is, is + index - 1);
            root.right = buildTree(preorder, ps + index + 1, pe, inorder, is + index + 1, ie);
            return root;
        }
        return null;
    }
}
