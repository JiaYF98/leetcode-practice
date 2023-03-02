import offer.Offer26;
import org.junit.Test;
import structure.TreeNode;

public class Offer26Test {
    @Test
    public void Test1() {
        TreeNode A = new TreeNode(3);
        A.left = new TreeNode(4);
        A.left.left = new TreeNode(1);
        A.left.right = new TreeNode(2);
        A.right = new TreeNode(5);

        TreeNode B = new TreeNode(4);
        B.left = new TreeNode(1);

        Offer26 offer26 = new Offer26();
        System.out.println(offer26.isSubStructure(A, B));
    }

    @Test
    public void Test2() {
        Offer26 offer26 = new Offer26();
        TreeNode A = new TreeNode(1);
        A.left = new TreeNode(2);
        A.right = new TreeNode(3);

        TreeNode B = new TreeNode(3);
        B.left = new TreeNode(1);

        System.out.println(offer26.isSubStructure(A, B));
    }

    @Test
    public void Test3() {
        Offer26 offer26 = new Offer26();
        TreeNode A = new TreeNode(1);
        A.left = new TreeNode(2);
        A.right = new TreeNode(3);
        A.left.left = new TreeNode(4);

        TreeNode B = new TreeNode(3);

        System.out.println(offer26.isSubStructure(A, B));
    }
}
