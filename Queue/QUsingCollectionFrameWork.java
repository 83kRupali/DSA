import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class QUsingCollectionFrameWork {
    public static void main(String[] args) {
        // queue is interface so u cannot implement queue
        Queue<Integer> q = new LinkedList<>();

        // 2nd implementation using ------> ArrayDequeue

        Queue<Integer>q1 = new ArrayDeque<>();
        
        q.add(10);
        q.add(20);
        q.add(30);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
