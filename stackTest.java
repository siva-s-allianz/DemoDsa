public class stackTest {

    static class Stack {

        int[] arr;
        int top;

        Stack(int size) {
            arr = new int[size];
            top = -1;
        }

        void push(int value) {

            if (top == arr.length - 1) {
                System.out.println("Stack is full.");
                return;
            }

            top++;
            arr[top] = value;
        }

        int pop() {

            if (top == -1) {
                System.out.println("Stack is empty.");
                return -1;
            }

            int value = arr[top];
            top--;

            return value;
        }

        int peek() {

            if (top == -1) {
                System.out.println("Stack is empty.");
                return -1;
            }

            return arr[top];
        }

        boolean isEmpty() {
            return top == -1;
        }
    }

    public static void main(String[] args) {

        Stack stack = new Stack(5);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());

        System.out.println("Removed: " + stack.pop());
        System.out.println("Removed: " + stack.pop());

        System.out.println("Top: " + stack.peek());
    }
}