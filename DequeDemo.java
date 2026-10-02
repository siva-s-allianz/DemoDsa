import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

    public static void main(String[] args) {

        Deque<Integer> stack = new ArrayDeque<>();

        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top: " + stack.peek());

        System.out.println("Removed: " + stack.pop());
        System.out.println("Removed: " + stack.pop());

        System.out.println("Top: " + stack.peek());
    }
}