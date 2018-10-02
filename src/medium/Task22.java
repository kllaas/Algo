package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task22 {

    public static char OPEN_BRACE = '(';
    public static char CLOSE_BRACE = ')';

    public static void main(String[] args) {
        List<String> res = generateParenthesis(3);
        for (String re : res) {
            System.out.println(re);
        }
    }

    public static List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList();
        backtrack(res, "", 0, 0, n);
        return res;
    }

    private static void backtrack(List<String> res, String s, int open, int close, int max) {
        if (s.length() == max * 2) {
            res.add(s);
            return;
        }

        if (open < max) {
            backtrack(res, s + OPEN_BRACE, open + 1, close, max);
        }

        if (close < open) {
            backtrack(res, s + CLOSE_BRACE, open, close + 1, max);
        }
    }


}
