package offer;

public class Offer05 {
    public String replaceSpace(String s) {
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < s.length(); i++) {
//            if (s.charAt(i) == ' ') {
//                sb.append("%20");
//            } else {
//                sb.append(s.charAt(i));
//            }
//        }
//
//        return sb.toString();

        return s.replaceAll(" ", "%20");
    }

    public static void main(String[] args) {
        Offer05 offer05 = new Offer05();
        System.out.println(offer05.replaceSpace("We are happy."));
        System.out.println(offer05.replaceSpace(""));
    }
}
