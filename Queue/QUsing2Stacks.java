import java.util.Stack;

public class QUsing2Stacks {

    static class Queue {

         Stack<Integer> s1 = new Stack<>();
         Stack<Integer> s2 = new Stack<>();

        public  boolean isEmpty(){
            return s1.empty();
        }

        // add

        //O(n+n)
        public  void add(int data){
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            s1.push(data);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // remove
        //O(1)
        public  int remove(){
            if(isEmpty()){
                System.out.println("Queue isEmpty.......");
                return -1;
            }

            return s1.pop();
        }

        //peek
        //O(1)
        public  int peeek(){
            if(isEmpty()){
                System.out.println("Queue isEmpty.......");
                return -1;
            }

            System.out.println("Peek:"+s1.peek());
            return s1.peek();
        }

        public  void printQueue(){
            if(isEmpty()){
                System.out.println("Queue isEmpty.......");
            }

            while (!s1.isEmpty()) {
                System.out.print(s1.pop()+" ");
            }
            System.out.println();
        }
    } 
    public static void main(String[] args) {
        
        Queue q = new Queue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.peeek();
        q.remove();
        q.peeek();
        q.printQueue();
    }
}
