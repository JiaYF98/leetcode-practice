package offer;

import java.util.*;

public class Offer32II {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>(new ArrayList<>());
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        while (!queue.isEmpty()) {
            List<Integer> childResult = new ArrayList<>();

            int currentLevelSize = queue.size();

            for (int i = 0; i < currentLevelSize; i++) {
                TreeNode peekTreeNode = queue.poll();

                assert peekTreeNode != null;
                if (peekTreeNode.left != null) {
                    queue.add(peekTreeNode.left);
                }

                if (peekTreeNode.right != null) {
                    queue.add(peekTreeNode.right);
                }

                childResult.add(peekTreeNode.val);
            }

            result.add(childResult);
        }

        return result;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);
        root.left.left = new TreeNode(22);
        root.left.right = new TreeNode(23);

        Offer32II offer32II = new Offer32II();
        System.out.println(offer32II.levelOrder(root));
    }
}
