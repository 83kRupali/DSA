import java.util.Stack;

public class MinStack1 {

    Stack<Integer> stack;
    int minValue;

    MinStack1() {
        stack = new Stack<>();
        minValue = 0;
    }

    public int minVal() {
        return minValue;
    }

    public void push(int val) {
        if (stack.isEmpty()) {
            stack.push(val);
            minValue = val;
        } else if (val < minValue) {
            stack.push(2 * val - minValue);
            minValue = val;
        } else {
            stack.push(val);  // Fixed the recursion issue
        }
    }

    public void pop() {
        if (stack.isEmpty()) {
            return;
        }
        if (stack.peek() < minValue) {
            minValue = 2 * minValue - stack.peek();
        }
        stack.pop();
    }

    public int peek() {
        if (stack.isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        if (stack.peek() < minValue) {
            return minValue;
        }
        return stack.peek();
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
