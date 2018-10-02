package easy;

public class Task67 {

    public static void main(String[] args) {
        System.out.println(addBinary("1010",
                "1011"));
    }

    public static String addBinary(String a, String b) {
        StringBuilder result = new StringBuilder();

        int index = 0;
        int carry = 0;

        while (index < a.length() || index < b.length() || carry != 0) {

            byte first = (byte) (index < a.length() ? Character.getNumericValue(a.charAt(a.length() - index - 1)) : 0);
            byte second = (byte) (index < b.length() ? Character.getNumericValue(b.charAt(b.length() - index - 1)) : 0);

            result.append((first + second + carry) % 2);

            carry = (first + second + carry) / 2;

            index++;
        }

        return result.reverse().toString();
    }

}
