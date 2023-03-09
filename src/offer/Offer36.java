package offer;

import structure.TreeNode;

import java.util.Stack;

public class Offer36 {
    /*
    思路：树的左指针指向中序遍历前一个结点，树的右指针指向中序遍历后一个结点
     */

    // TreeNode 要替换为 Node
    private final Stack<TreeNode> stack = new Stack<>();

    public TreeNode treeToDoublyList(TreeNode root) {
        if (root == null) {
            return null;
        }

        traverse(root);

        TreeNode head;
        TreeNode rear = stack.peek();
        while (stack.size() > 1) {
            TreeNode pop = stack.pop();
            TreeNode peek = stack.peek();
            pop.left = peek;
            peek.right = pop;
        }
        head = stack.pop();
        head.left = rear;
        rear.right = head;

        return head;
    }

    private void traverse(TreeNode root) {
        if (root == null) {
            return;
        }

        traverse(root.left);
        stack.push(root);
        traverse(root.right);
    }

/*
    class Solution {
        Node pre, head;
        public Node treeToDoublyList(Node root) {
            if(root == null) return null;
            dfs(root);
            head.left = pre;
            pre.right = head;
            return head;
        }
        void dfs(Node cur) {
            if(cur == null) return;
            dfs(cur.left);
            if(pre != null) pre.right = cur;
            else head = cur;
            cur.left = pre;
            pre = cur;
            dfs(cur.right);
        }
    }
 */

}
