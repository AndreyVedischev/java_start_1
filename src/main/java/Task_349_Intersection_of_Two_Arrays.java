import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task_349_Intersection_of_Two_Arrays {
    public static void main(String[] args) {
        System.out.println();
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length) {
            return intersection(nums2, nums1);
        }
        Set<Integer> set = new HashSet<>();
        for (int num : nums1) {
            set.add(num);
        }
        List<Integer> ans = new ArrayList<>();
        for (int num : nums2) {
            if (set.contains(num)) {
                ans.add(num);
                set.remove(num);
            }

        }
        int[] answ = new int[ans.size()];
        for (int i = 0; i < ans.size(); i++) {
            answ[i] = ans.get(i);
        }
        return answ;


    }
}
