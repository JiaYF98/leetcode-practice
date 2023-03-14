package offer;

public class Offer33 {
    /*
    思路：
        数组长度为 0，返回 true
        从后往前遍历，后面第一个节点为根，往前遍历找到第一个比根小的节点，此节点之后一直到根节点为根的右子树，比根的值大，之前为根的左子树，比根节点的值大
        若该节点前面有比根节点值大的节点，则不是二叉搜索树的后序遍历，返回 false
        分别遍历左右子树，并重复以上步骤
        遍历完后返回 true
     */
    public boolean verifyPostorder(int[] postorder) {
        if (postorder.length == 0)
            return true;
        return isPostorder(postorder, 0, postorder.length - 1);
    }

    private boolean isPostorder(int[] postorder, int start, int end) {
        if (start == end)
            return true;

        int target = postorder[end];
        int index = -1;

        // 找右子树边界
        for (int i = end - 1; i >= start; i--) {
            if (postorder[i] < target) {
                index = i;
                break;
            }
        }

        // 找左子树中是否存在比根节点大的数
        for (int i = index - 1; i >= start; i--) {
            if (postorder[i] > target) {
                return false;
            }
        }

        // 没有左子树或右子树
        if (index == -1 || index == end - 1) {
            return isPostorder(postorder, start, end - 1);
        }

        return isPostorder(postorder, start, index) && isPostorder(postorder, index + 1, end - 1);
    }
}
