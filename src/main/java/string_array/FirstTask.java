package string_array;
import java.util.Arrays;
public class FirstTask {
    public static void main(String[] args) {
        System.out.println("Решение задачи 1920");

        int[] nums = {0,2,1,5,3,4};
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length;i++) {
            ans[i] = nums[nums[i]];
        }
        System.out.println(Arrays.toString(ans));
    }
}
