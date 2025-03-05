import java.util.Deque;
import java.util.LinkedList;

public class StackUsingDeque {

    static class Stack {
        Deque<Integer> qeque = new LinkedList<>();
        
        public void push(int data){
            qeque.addLast(data);
        }

        public void pop(){
            qeque.removeLast();
        }

        public int peek(){
            return qeque.getLast();
        }
    }
    public static void main(String[] args) {

        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());

    }
}
