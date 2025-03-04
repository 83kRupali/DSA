// Interleave 2 Halves of a Queue(even length)
import java.util.LinkedList;
import java.util.Queue;

public class Interleave2HalvesQueue {

    public static void interleave2HalvesQueue(Queue<Integer>q){
        int size = q.size();
        int n = size/2;

        Queue<Integer>firstHalf = new LinkedList<>();

        for(int i=0; i<n; i++){
            firstHalf.add(q.remove());
        }

        while(!firstHalf.isEmpty()){
            q.add(firstHalf.remove());
            q.add(q.remove());
        }

        while (!q.isEmpty()) {
            System.out.print(q.remove()+"  ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Queue<Integer>q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);
        interleave2HalvesQueue(q);
    }
}
