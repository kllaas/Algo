package medium;

public class Task5 {

    public static void main(String[] args) {
        System.out.println(longestPalindrome("cbbd"));;
    }

    public static String longestPalindrome(String s) {
        if (s == null || s.length() == 0) return s;

        String res = "";

        for (int i = 0; i < s.length(); i++)
            for (int j = i + 1; j <= s.length(); j++) {

                if (j - i <= res.length()) continue;

                String substring = s.substring(i, j);
                if (isPalindrome(substring) && substring.length() > res.length()) {
                    res = substring;
                }
            }

        return res;
    }

    public static boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }

        return true;
    }
}
