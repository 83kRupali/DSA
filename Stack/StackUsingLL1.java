import java.util.LinkedList;

public class StackUsingLL1 {
    LinkedList<Integer> ll; // Declare LinkedList

   // Constructor to initialize LinkedList
   public StackUsingLL1() {
       ll = new LinkedList<>();
   }

   public boolean isEmpty() {
       return ll.isEmpty();
   }

   public void push(int val) {
       ll.addLast(val);
   }

   public int popped() {
       if (isEmpty()) {
           throw new RuntimeException("Stack Underflow: Cannot pop from an empty stack");
       }
       return ll.removeLast();
   }

   public int top() {
       if (isEmpty()) {
           throw new RuntimeException("Stack is empty");
       }
       return ll.getLast();
   }

   public static void main(String[] args) {
       StackUsingLL1 st = new StackUsingLL1();
       st.push(10);
       st.push(20);
       st.push(30);
       st.push(40);
       st.push(50);
       st.push(60);
       st.push(70);
       
       System.out.println("Popped: " + st.popped()); // 70
       System.out.println("Popped: " + st.popped()); // 60
       System.out.println("Popped: " + st.popped()); // 50
       System.out.println("Popped: " + st.popped()); // 40
   }
}
