public class CircularQueueArray {

    static class CircularQueue{

        int arr[];
        int size;
        int rear;
        int front;

        CircularQueue(int capacity){
            size= capacity;
            arr = new int[capacity];
            rear = -1;
            front  = -1;
        }

        public boolean isEmpty(){
            return rear == -1 && front == -1;
        }

        public boolean isFull(){
            return (rear+1)%size == front;
        }

        public void add(int data){
            if(isFull()){
                System.out.println("Queue is Full......");
                return;
            }

            // add in the first element

            if(front == -1){
                front = 0;
            }

            rear = (rear+1) % size;

            arr[rear] = data;
        }

        //remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty....");
                return -1;
            }

            int result = arr[front];
            System.out.println("Remove: "+result);

            // last element delete
            if(rear == front){
                rear = front = -1;
            }
            else{
                front = (front + 1)%size;
            }
            return result;
        }

        //peek
        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty....");
                return -1;
            }

            int removeElement = arr[front];
            System.out.println("Peek: "+removeElement);
            return removeElement;
        }
    }

    
    public static void main(String[] args) {
        CircularQueue q = new CircularQueue(3);
        q.add(10);
        q.add(20);
        q.add(30);
        
        q.remove();
        q.remove();
        q.add(40);
        q.remove();
        
        q.peek();
    }
}

