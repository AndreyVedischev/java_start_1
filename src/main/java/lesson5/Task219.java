package lesson5;

import java.util.HashMap;
import java.util.Map;

public class Task219 {
    public static void main(String[] args) {
        System.out.println("Решение задачи: ");
        int[] nums = {1, 2, 3, 1};
        int k = 3;
        System.out.println(containsNearbyDuplicate(nums, k));

    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                if (i - map.get(nums[i]) <= k) {
                    return true;
                }
            }
            map.put(nums[i], i);

        }
        return false;
    }
}
