package string_array;

public class Task125 {
    public static void main(String[] args) {
        String s = "race a car";
        int leftIdx = 0;
        int rightIdx = s.length() - 1;

        while (leftIdx < rightIdx) {
            while (leftIdx < rightIdx && !Character.isLetterOrDigit(s.charAt(leftIdx))) {
                leftIdx++;
            }
            while (leftIdx < rightIdx && !Character.isLetterOrDigit(s.charAt(rightIdx))) {
                rightIdx--;
            }
            char leftChar = Character.toLowerCase(s.charAt(leftIdx));
            char rightChar = Character.toLowerCase(s.charAt(rightIdx));
            if (leftChar != rightChar) {
                System.out.println(false);
            }
                leftIdx++;
                rightIdx--;
        }
        System.out.println(true);
    }
}
