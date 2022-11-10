package lesson3;

//Задано уравнение вида q + w = e, q, w, e >= 0.
//Некоторые цифры могут быть заменены знаком вопроса, например 2? + ?5 = 69.
//Требуется восстановить выражение до верного равенства.
//Предложить хотя бы одно решение или сообщить, что его нет.

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class uravnenie {

    public static List<List<Integer>> result = new ArrayList<>();
    public static List<Integer> list = new ArrayList<>();
    public static List<Integer> index = new ArrayList<>();
    public static Character[] temp;

    public static void main(String[] args) {
        System.out.println("Решение задачи: ");
        String str = " 2? + ?5 =  69 ";
        System.out.println(combine(incomingStr(str)));
    }
    private static int incomingStr(String str) {
        String incoming = str.replace(" ", "");
        temp = new Character[incoming.length()];
        for (int i = 0; i < incoming.length(); i++) {
            temp[i] = incoming.charAt(i);
            if (incoming.charAt(i) == '?') index.add(i);
        }
        System.out.println(Arrays.toString(temp));
        return index.size();
    }
    private static boolean checkingExpr() {
        int j = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < temp.length; i++) {
            if (j < list.size() && i == index.get(j)) {
                sb.append((int) list.get(j));
                j++;
            } else if (temp[i] == '+') {
                sb.append("=");
            } else {
                sb.append(temp[i]);
            }
        }
        String[] resStr = sb.toString().split("=");

        return Integer.parseInt(resStr[0]) + Integer.parseInt(resStr[1]) == Integer.parseInt(resStr[2]);
    }
    private static void backTrack(int k) {
        if (k == 0) {
            if (checkingExpr()) {
                result.add(new ArrayList<>(list));
            }
            return;
        }
        for (int i = 0; i <= 9; i++) {
            list.add(i);
            backTrack(k - 1);
            list.remove(list.size() - 1);
        }
    }
    public static List<List<Integer>> combine(int k) {
        backTrack(k);
        return result;
    }

}
