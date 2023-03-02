package offer;

import structure.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

public class Offer26 {
    private void findFirstNode(TreeNode root, Queue<TreeNode> queue, int target) {
        if (root == null) {
            return;
        }

        if (root.val == target) {
            queue.add(root);
        }
        findFirstNode(root.left, queue, target);
        findFirstNode(root.right, queue, target);
    }

    private boolean matching(TreeNode a, TreeNode b) {
        if (b == null) {
            return true;
        } else if (a == null || a.val != b.val) {
            return false;
        }

        return matching(a.left, b.left) && matching(a.right, b.right);
    }

    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (A == null || B == null) {
            return false;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        findFirstNode(A, queue, B.val);

        boolean flag = false;
        while (!queue.isEmpty()) {
            TreeNode root = queue.poll();
            if (matching(root, B)) {
                flag = true;
            }
        }
        return flag;
    }


    // 示例代码
    public boolean isSubStructure2(TreeNode A, TreeNode B) {
        if (B == null || A == null) return false;
        return dfs(A, B) || isSubStructure2(A.left, B) || isSubStructure2(A.right, B);
    }

    public boolean dfs(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null) return false;
        return (A.val == B.val) && dfs(A.left, B.left) && dfs(A.right, B.right);
    }
}
