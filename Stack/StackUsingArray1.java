import java.util.ArrayList;

public class StackUsingArray1 {
    ArrayList<Integer> arr; // Declare the ArrayList

    // Constructor to initialize the ArrayList
    public StackUsingArray1() {
        arr = new ArrayList<>();
    }

    public void push(int val) {
        arr.add(val);  // Use add() instead of addLast()
    }

    public int pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack Underflow");
        }
        return arr.remove(arr.size() - 1);
    }

    int top() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return arr.get(arr.size() - 1);
    }

    public boolean isEmpty() {
        return arr.isEmpty();
    }

    public static void main(String[] args) {
        StackUsingArray1 st = new StackUsingArray1();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        while (!st.isEmpty()) {
            System.out.print(st.top() + " ");
            st.pop();
        }
        System.out.println();
    }
}


