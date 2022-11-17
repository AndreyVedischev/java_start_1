import java.util.HashSet;
import java.util.Set;

public class Task_217_Contains_Duplicate {
    public static void main(String[] args) {
        System.out.println();
    }

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }
}
