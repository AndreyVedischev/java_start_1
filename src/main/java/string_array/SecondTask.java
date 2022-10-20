package string_array;
import java.util.Arrays;

public class SecondTask {
    public static void main(String[] args) {
        System.out.println("Решение задачи 283");

        int[] num= {0,1,2,2,3,0,4,2};
        int val = 2;
        int copyIndex = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] != val) {
                num[copyIndex] = num[i];
                copyIndex++;
            }
        }
        while (copyIndex < num.length) {
            num[copyIndex++] = 0;
        }
        System.out.println(Arrays.toString(num));
    }
}
