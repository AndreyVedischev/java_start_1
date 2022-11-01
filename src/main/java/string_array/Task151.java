package string_array;

public class Task151 {

    public static void main(String[] args) {
        System.out.println("Решение задачи 151");
        String s = "a good   example";
        System.out.println(rewerseWords(s));
    }


    public static String rewerseWords(String s) {
        StringBuilder sb = new StringBuilder();
        int end = s.length() - 1;
        while (end >= 0) {
            if (s.charAt(end) == ' ') {
                end -= 1;
                continue;
            }
            int start = end - 1;
            while (start >= 0 && s.charAt(start) != ' ') {
                start -= 1;
            }
            sb.append(" ");
            sb.append(s.substring(start + 1, end + 1));
            end = start - 1;
        }
        if (sb.length() > 0) {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }


}
