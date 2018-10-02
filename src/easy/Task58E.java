package easy;

public class Task58E {

    public static void main(String[] args) {

    }

    public int lengthOfLastWord(String s) {
        if (s == null || s.length() == 0) return 0;
        String[] splitted = s.split(" ");
        return splitted[splitted.length - 1].length();
    }
}
