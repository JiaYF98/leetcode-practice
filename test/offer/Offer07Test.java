package offer;

import org.junit.Test;
import structure.TreeNode;

public class Offer07Test {
    @Test
    public void Test1() {
        Offer07 offer07 = new Offer07();
        TreeNode treeNode = offer07.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7});
        System.out.println(treeNode.val);
    }

    @Test
    public void Test2() {
        Offer07 offer07 = new Offer07();
        TreeNode treeNode = offer07.buildTree(new int[]{-1}, new int[]{-1});
        System.out.println(treeNode.val);
    }

    @Test
    public void Test3() {
        Offer07 offer07 = new Offer07();
        TreeNode treeNode = offer07.buildTree(new int[]{1, 2, 3, 4}, new int[]{1, 2, 3, 4});
        System.out.println(treeNode.val);
    }
}
