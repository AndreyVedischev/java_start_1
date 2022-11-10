package lesson4;

import java.util.Stack;

public class Task20 {
    public static void main(String[] args) {
        System.out.println("Решение задачи: ");
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '(') {
                st.push(')');
            } else if (s.charAt(i)== '[') {
                st.push(']');
            } else if (s.charAt(i) == '{') {
                st.push('}');
            } else {
                if (st.isEmpty()) {
                    return false;
                }
                if (st.peek() != s.charAt(i)) {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();

    }
}
