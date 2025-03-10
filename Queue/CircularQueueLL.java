public class CircularQueueLL {

    static class  Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    Node front;
    Node rear;

    CircularQueueLL(){
        this.front = null;
        this.rear = null;
    }

    public boolean isEmpty(){
        return front == null && rear == null;
    }

    public void push(int data){
        Node newNode = new Node(data);

        if(front == null){
            front = newNode;
            rear = newNode;
            rear.next = front;
        }
        else{
            rear.next = newNode;
            rear = newNode;
            rear.next = front;
        }
 
        System.out.println("Push: "+data);
    }

    public int pop(){
        if(isEmpty()){
            return -1;
        }
        
        int val = front.data;
        System.out.println("Pop: "+val);
       

        if(front == rear){
            front = null;
            rear = null;
        }
        else{
            front = front.next;
            rear.next = null;
        }
        
        return val;
    }

    public int peek(){
        if(isEmpty()){
            return -1;
        }
        
        int val = front.data;
        System.out.println("Peek: "+val);
        return val;
    }
    public static void main(String[] args) {
        CircularQueueLL cq = new CircularQueueLL();
        cq.push(10);
        cq.pop();
        cq.push(20);
        cq.push(30);
        cq.push(40);
        cq.push(50);
        cq.peek();
        cq.pop();
        cq.peek();
    }
}
