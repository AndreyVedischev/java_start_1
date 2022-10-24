package lesson2.recursiya;

public class Task70 {
    public static void main(String[] args) {
        System.out.println("Решение задачи 70: ");
        System.out.println(climbStairs(10));
    }
    public static int climbStairs(int n) {
        int fib;
        if (n <= 3) {
            fib= n;
        } else {
            fib = climbStairs(n - 1) + climbStairs(n - 2);
        }
        return fib;
    }
}
