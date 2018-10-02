package medium;

public class Task6 {

    public static void main(String[] args) {
        System.out.println(convert("AB", 1));
    }

    public static String convert(String s, int numRows) {
        if (s == null || numRows <= 1) return s;

        StringBuilder[] columns = new StringBuilder[numRows];
        int row = 0; boolean goForward = true;

        for (int i = 0; i < columns.length; i++) {
            columns[i] = new StringBuilder();
        }

        for (char ch : s.toCharArray()) {

            columns[row].append(ch);

            row += goForward ? 1 : -1;
            if (row == numRows - 1 || row == 0) goForward = !goForward;

        }

        StringBuilder res = new StringBuilder();

        for (StringBuilder column : columns) {
            res.append(column);
        }

        return res.toString();
    }

}
