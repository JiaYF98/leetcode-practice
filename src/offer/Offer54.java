package offer;

import structure.TreeNode;

public class Offer54 {
    private int count;
    private int result;
    private boolean flag;

    public int kthLargest(TreeNode root, int k) {
        findResult(root, k);
        return result;
    }

    private void findResult(TreeNode root, int k) {
        if (root == null) {
            return;
        }

        findResult(root.right, k);

        count++;
        if (count == k) {
            result = root.val;
            flag = true;
            return;
        }

        if (!flag) {
            findResult(root.left, k);
        }
    }
}
