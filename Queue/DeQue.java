import java.util.Deque;
import java.util.LinkedList;

public class DeQue {

    public static void main(String[] args) {
        Deque<Integer>deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        System.out.println(deque);
        deque.addLast(3);
        deque.addLast(4);
        System.out.println(deque);
        deque.remove();
        System.out.println(deque);
        deque.removeFirst();
        deque.removeLast();
        System.out.println(deque);
       
    }
}
