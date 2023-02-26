package offer;

public class Offer58 {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n, s.length()) + s.substring(0, n);
    }

    public static void main(String[] args) {
        Offer58 offer58 = new Offer58();
        System.out.println(offer58.reverseLeftWords("abcdefg", 2));
        System.out.println(offer58.reverseLeftWords("lrloseumgh", 6));
    }
}
