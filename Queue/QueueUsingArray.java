public class QueueUsingArray {

   static class Queue{

        int arr[];
        int size;
        int rear;

        Queue(int capacity){
            size= capacity;
            arr = new int[capacity];
            rear = -1;
        }

        public boolean isEmpty(){
            return rear == -1;
        }

        public void add(int data){
            if(rear == size-1){
                System.out.println("Queue is Full......");
                return;
            }

            rear = rear+1;
            arr[rear] = data;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty....");
                return -1;
            }

            int front = arr[0];
            System.out.println("Remove: "+front);

            for(int i=0; i<rear; i++){
                arr[i] = arr[i+1];
            }
            rear = rear-1;
            return front;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty....");
                return -1;
            }

            int removeElement = arr[0];
            System.out.println("Peek: "+removeElement);
            return removeElement;
        }
    }

    
    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.remove();
        q.remove();
        q.remove();
        q.remove();
        q.peek();
    }
}