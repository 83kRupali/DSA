import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {

     static class Queue {
        Deque<Integer> qeque = new LinkedList<>();
        
        public void push(int data){
            qeque.addLast(data);
        }

        public void pop(){
            qeque.removeFirst();
        }

        public int peek(){
            return qeque.getFirst();
        }
    }
    public static void main(String[] args) {

        Queue s= new Queue();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s.peek());

    }
}
