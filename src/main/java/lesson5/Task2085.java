package lesson5;

import java.util.HashMap;
import java.util.Map;

public class Task2085 {
    public static void main(String[] args) {
        System.out.println("Решение задачи: ");
        String[] words1 = {"leetcode","is","amazing","as","is"};
        String[] words2 = {"amazing","leetcode","is"};
        System.out.println(countWords(words1, words2));

    }
    public static int countWords(String[] words1, String[] words2) {
        Map<String, Integer> count = new HashMap<>();

        for (String word : words1)
            count.merge(word, 1, Integer::sum);

        for (String word : words2)
            if (count.containsKey(word) && count.get(word) < 2)
                count.merge(word, -1, Integer::sum);

        return (int) count.values().stream().filter(v -> v == 0).count();
    }
}
