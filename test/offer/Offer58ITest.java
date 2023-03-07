package offer;

import org.junit.Test;

public class Offer58ITest {
    @Test
    public void Test1() {
        Offer58I offer58I = new Offer58I();
        System.out.println(offer58I.reverseWords("the sky is blue"));
        System.out.println(offer58I.reverseWords(""));
        System.out.println(offer58I.reverseWords("  hello world"));
        System.out.println(offer58I.reverseWords("  hello world  "));
        System.out.println(offer58I.reverseWords("a good   example"));
        System.out.println(offer58I.reverseWords("a"));
        System.out.println(offer58I.reverseWords("  "));
    }
}
