import java.util.Stack;
import java.util.AbstractMap;

public class MinStack1 {

    Stack<AbstractMap.SimpleEntry<Integer, Integer>> stack;

    MinStack1() {
        stack = new Stack<>();
    }

    public int minVal() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.peek().getValue();
    }

    public void push(int val) {
        int minValue = stack.isEmpty() ? val : Math.min(val, stack.peek().getValue());
        stack.push(new AbstractMap.SimpleEntry<>(val, minValue));
    }

    public void pop() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        stack.pop();
    }

    public int peek() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.peek().getKey();
    }

    public static void main(String[] args) {
        MinStack1 mins = new MinStack1();
        mins.push(-2);
        mins.push(0);
        mins.push(-3);

        System.out.println("Min value: " + mins.minVal()); // Should print -3
        mins.pop();
        System.out.println("Min value after pop: " + mins.minVal()); // Should print -2
    }
}
