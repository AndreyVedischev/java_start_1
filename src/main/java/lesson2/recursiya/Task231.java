package lesson2.recursiya;

public class Task231 {
    public static void main(String[] args) {
        System.out.println("Решение задачи 231: ");
        System.out.println(isPowerOfTwo(16));
    }
    public static boolean isPowerOfTwo(int n) {
        if (n == 1) return true;
        if (n % 2 != 0) return false;
        if (n == 0) return false;
        return isPowerOfTwo(n/2);

    }
}
