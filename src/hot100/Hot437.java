package hot100;

import structure.TreeNode;

public class Hot437 {
    private int result;

    public int pathSum(TreeNode root, int targetSum) {
        getPathSum(root, targetSum);
        return result;
    }

    private void getPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return;
        }

        calculatePathSum(root, targetSum, 0);
        getPathSum(root.left, targetSum);
        getPathSum(root.right, targetSum);
    }

    private void calculatePathSum(TreeNode root, int targetSum, long currentSum) {
        if (root == null) {
            return;
        }

        currentSum += root.val;
        if (currentSum == targetSum) {
            result++;
        }

        calculatePathSum(root.left, targetSum, currentSum);
        calculatePathSum(root.right, targetSum, currentSum);
    }
}
