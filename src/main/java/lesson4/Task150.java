package lesson4;


import java.util.Set;
import java.util.Stack;


public class Task150 {
    public static void main(String[] args) {
        System.out.println("Решение задачи: ");
        String[] s = {"4", "13", "5", "/", "+"};
        System.out.println(evalRPN(s));

    }

    public static int evalRPN(String[] tokens) {
        Set<String> ops = Set.of("+", "-", "*", "/");
        Stack<Integer> opnds = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            if (!ops.contains(tokens[i])) {
                opnds.push(Integer.parseInt(tokens[i]));
            } else {
                switch (tokens[i]) {
                    case "+":
                        opnds.push(opnds.pop() + opnds.pop());
                        break;
                    case "-":
                        opnds.push(-opnds.pop() + opnds.pop());
                        break;
                    case "*":
                        opnds.push(opnds.pop() * opnds.pop());
                        break;
                    case "/":
                        int temp = opnds.pop();
                        opnds.push(opnds.pop() / temp);
                        break;
                }
            }
        }
        return opnds.peek();

    }
}
