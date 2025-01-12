//package Apna_College.CircularLL;

public class CircularLL {
    Node head;
    Node tail;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    CircularLL(){
        this.head = null;
        this.tail = null;
    }

    public void insertAtHead(int data){
        Node newNode = new Node(data);

        if(tail == null){
            head = tail = newNode;
            tail.next = head;
        }
        else{
            newNode.next = head;
            head = newNode;
            tail.next = newNode;
        }
    }
 
    // Without using head;


    // public void insertAtHead(int data){
    //     Node newNode = new Node(data);

    //     if(head == null){
    //         tail = newNode;
    //         tail.next = newNode;
    //     }
    //     else{
    //         tail.next = newNode.next;
    //           tail = newNode;
    //     }
    // }

    public void printLL(){
        if(head == null){
            return;
        }
        System.out.print(head.data+"->");
        Node temp = head.next;

        while (temp != head) {
            System.out.print(temp.data+"->");
            temp = temp.next; 
        };
        System.out.println("null");
    }

    public void insertAtTail(int data){
        Node newNode = new Node(data);
        if(tail == null){
            head = tail = newNode;
            tail.next = head;
        }
        else{
            newNode.next = head;
            tail.next = newNode;
            tail = newNode;
        }
    }

    // public void deleteAtHead(){
    //     if(head == null){
    //         return;
    //     }

    //     tail.next = head.next;
    //     head= head.next;
    // }
    public void deleteAtHead(){
        if(head == null){
            return;
        }
        else if(head == tail){
            head = tail = null;
            System.out.println("empty..");
            return;
        }
        else{
            head= head.next;
            tail.next = head;
        }
    }

    public void deleteAtTail(){
        if(head == null){
            return;
        }

        else if(head == tail){
            head = tail = null;
            System.out.println("empty..");
            return;
        }
        else{

            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            tail = temp;
            tail.next = head;
        }
    }

    public static void main(String[] args) {
        CircularLL c = new CircularLL();
        c.insertAtHead(10);
        c.insertAtHead(20);
        c.insertAtHead(30);
        c.printLL();
        c.insertAtTail(40);
        c.printLL();
        c.insertAtTail(50);
        c.printLL();
        c.deleteAtHead();
       c.printLL();
       c.deleteAtTail();
       c.printLL();
       c.deleteAtTail();
       c.printLL();
       c.deleteAtTail();
       c.printLL();
       c.deleteAtTail();
       c.printLL();
    }
}
