package lesson5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Task350 {
    public static void main(String[] args) {
        System.out.println("Решение задачи: ");
        int[] num1 = {4,9,5};
        int[] num2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(num1, num2)));

    }
    public static int[] intersect(int[] nums1, int[] nums2) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i: nums1){
            if(map.containsKey(i)) {
                map.put(i, map.get(i)+1);
            } else {
                map.put(i, 1);
            }
        }

        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i: nums2){
            if(map.containsKey(i)) {
                if(map.get(i)>1){
                    map.put(i, map.get(i)-1);
                } else{
                    map.remove(i);
                }

                list.add(i);
            }
        }

        int[] result = list.stream().mapToInt(Integer::intValue).toArray();

        return result;
    }
}
