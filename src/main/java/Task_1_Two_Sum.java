import java.util.HashMap;
import java.util.Map;

public class Task_1_Two_Sum {
    public static void main(String[] args) {
        System.out.println();
    }

    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int added = target - nums[i];
            if (map.containsKey(added)) {
                return new int[]{map.get(added), i};
            }
            map.put(nums[i], i);
        }
        return null;


    }
}
