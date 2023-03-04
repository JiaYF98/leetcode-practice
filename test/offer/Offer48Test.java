package offer;

import org.junit.Test;

public class Offer48Test {
    @Test
    public void Test1() {
        Offer48 offer48 = new Offer48();
        System.out.println(offer48.lengthOfLongestSubstring("abcabcbb"));
        System.out.println(offer48.lengthOfLongestSubstring("bbbbb"));
        System.out.println(offer48.lengthOfLongestSubstring("pwwkew"));
        System.out.println(offer48.lengthOfLongestSubstring(""));
        System.out.println(offer48.lengthOfLongestSubstring("afdsafewfew"));
    }
}
