// Introduction to linkedList

public class LinkedList {

    Node head;
    Node tail;

    public class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    LinkedList(){
        head = null;
        tail = null;
    }

    //Push Front in LL
    // Time Complexity:O(1)

    public void push_Front(int data){
        //create a newNode
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        else{
            newNode.next = head;
            head =  newNode;
        }
    }

    // Print a LL
     // Time Complexity:O(n)

    public void printLL(){
        Node current = head;
        while (current != null) {
            System.out.print(current.data +"->");
            current = current.next;
        }
        System.out.println("null");
    }


    //Push Back in LL
    // Time Complexity:O(1)

    public void pushBack(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = tail = newNode;
            return;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    //without using tail pointer
    // Time Complexity : O(n)
    public void pushBack1(int data){
        Node newNode = new Node(data);
        
        if(head == null){
            head = tail = newNode;
            return;
        }
        else{
            Node temp = head;

            while (temp != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            temp = newNode;
        }
    }

    //popfront in LL
    // Time Complexity:O(1)

    public void popFront(){
        if(head ==  null){
            return;
        }

        Node temp = head;
        head = head.next;
        temp.next = null;
    }


    //PopBack in LL
    // Time Complexity:O(n)

    public void PopBack1(){
        if(head == null){
            return;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
    }


    public void PopBack2(){
        if(head == null){
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    //Insert at middle
    // Time Complexity:O(n)

    public void insertMiddle(int val, int pos){
        Node newNode = new Node(val);
        if(pos < 0){
            return;
        }

        if(pos == 0){
            push_Front(val);
        }

        Node temp = head;

        for(int i=0; i<pos-1; i++){
            if(temp == null){
                System.out.println("Invalid position");
                return;
            }
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Search in LL
    // Time Complexity:O(n)
    public int search(int key){

        if(head == null) return -1;

        Node temp = head;
        int idx = 1;
        while (temp != null) {
            if(temp.data == key){
                return idx;
            }
            temp  = temp.next;
            idx++;
        }
        return -1;
    }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.push_Front(10);
        ll.push_Front(20);
        ll.push_Front(30);
        ll.printLL();

        ll.pushBack(40);
        ll.pushBack(50);
        ll.printLL();
        ll.popFront();
        ll.printLL();
        ll.PopBack1();
        ll.printLL();
        ll.PopBack2();
        ll.printLL();
        ll.insertMiddle(60, 1);
        ll.printLL();
        ll.insertMiddle(60, 5);
        ll.printLL();

        System.out.println(ll.search(60));
        System.out.println(ll.search(40));

    }
}
