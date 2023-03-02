package offer;

import structure.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


public class Offer32I {
    public int[] levelOrder(TreeNode root) {
        if (root == null) {
            return new int[]{};
        }

        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);

        ArrayList<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode peek = queue.peek();
            if (peek.left != null) {
                queue.add(peek.left);
            }

            if (peek.right != null) {
                queue.add(peek.right);
            }

            list.add(peek.val);
            queue.poll();
        }

        int size = list.size();
        int[] res = new int[size];

        for (int i = 0; i < size; i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        Offer32I offer32I = new Offer32I();
        System.out.println(Arrays.toString(offer32I.levelOrder(root)));
    }
}
