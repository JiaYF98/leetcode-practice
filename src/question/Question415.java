package question;

public class Question415 {
    public String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();

        int index1 = num1.length() - 1, index2 = num2.length() - 1;
        int carry = 0;
        while (index1 >= 0 && index2 >= 0) {
            int sum = num1.charAt(index1) - '0' + num2.charAt(index2) - '0' + carry;
            stringBuilder.append(sum % 10);
            carry = sum / 10;
            index1--;
            index2--;
        }

        while (index1 >= 0) {
            int sum = num1.charAt(index1) - '0' + carry;
            stringBuilder.append(sum % 10);
            carry = sum / 10;
            index1--;
        }
        while (index2 >= 0) {
            int sum = num2.charAt(index2) - '0' + carry;
            stringBuilder.append(sum % 10);
            carry = sum / 10;
            index2--;
        }
        if (carry != 0) {
            stringBuilder.append(carry);
        }

        return stringBuilder.reverse().toString();
    }
}
