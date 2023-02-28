package offer;

import java.util.*;

public class Offer32III {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>(new ArrayList<>());
        }

        List<List<Integer>> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        boolean leftToRight = true;

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

            if (leftToRight) {
                result.add(childResult);
                leftToRight = false;
            } else {
                Collections.reverse(childResult);
                result.add(childResult);
                leftToRight = true;
            }

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

        Offer32III offer32III = new Offer32III();
        System.out.println(offer32III.levelOrder(root));
    }
}
