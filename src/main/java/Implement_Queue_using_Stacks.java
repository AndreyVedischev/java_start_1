import java.util.Stack;

public class Implement_Queue_using_Stacks {
    public static void main(String[] args) {
        System.out.println();
    }
    class MyQueue {
        Stack<Integer> input;
        Stack<Integer> output;

        public MyQueue() {
            input = new Stack<>();
            output = new Stack<>();
        }

        public void push(int x) {
            input.push(x);

        }

        public int pop() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.pop();
        }

        public int peek() {
            if (output.isEmpty()) {
                while (!input.isEmpty()) {
                    output.push(input.pop());
                }
            }
            return output.peek();
        }

        public boolean empty() {
            return input.isEmpty() && output.isEmpty();
        }
    }

}
