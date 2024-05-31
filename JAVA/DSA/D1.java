package DSA;
import java.util.Stack;


public class D1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("Java");
        stack.push("Python");
        stack.push("C++");
        stack.push("JavaScript");
        stack.push("Ruby");

        System.out.println("Initial Stack: " + stack);

        System.out.println("Is stack empty? " + stack.isEmpty());

        System.out.println("Stack size: " + stack.size());

        System.out.println("Removing elements until 'Python' is found:");
        while (!stack.isEmpty()) {
            String element = stack.pop();
            System.out.println("Popped: " + element);
            if (element.equals("Python")) {
                break;
            }
        }

        System.out.println("Stack after removing elements: " + stack);

        stack.clear();
        System.out.println("Stack after clear: " + stack);
    }
}
