package string_array;

public class Task151 {

    public static void main(String[] args) {

        System.out.println("Решение задачи 151");

        String s = "a good   example";
        int wordStart = 0;
        int wordEnd = 0;
        int i = s.length()-1;

        StringBuilder result = new StringBuilder(s.length());
        while (i >= 0) {
            if (s.charAt(i) != ' ') {
                wordEnd = i;
                if (wordEnd == 0) {
                    result.append(s.charAt(0));
                    break;
                }
                else {
                    while (s.charAt(i) != ' ' && i != 0) {
                        i--;
                    }
                    wordStart = i;
                }
                result.append(s.substring(wordStart + 1, wordEnd + 1)).append(' ');
                if (i == 0) break;
            }
            else {
                i--;
            }
        }
        if (result.charAt(result.length()-1) == ' ') {
            result = result.deleteCharAt(result.length() - 1);
        }
        System.out.println(result.toString());
    }
}
