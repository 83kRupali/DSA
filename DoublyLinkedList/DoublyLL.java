//package Apna_College.DoublyLL;

public class DoublyLL {

    Node  head;
    Node tail;

    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    DoublyLL(){
        head = null;
        tail = null;
    }

    public void pushFront(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }
        else{
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }


    public void pushBack(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
        }
        else{
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
    }


    public void popFront(){
        if(head == null){
            return;
        }

        Node temp = head;
        head = head.next;

        if(head != null){
            head.prev = null;
        }
        // else{
        //     tail = null;
        // }
        temp.next = null;
        //temp.prev = null;
    }

    public void popBack(){
        if(head == null){
            return;
        }

        Node temp = tail;
        tail = tail.prev;

        if(tail != null){
            tail.next = null;
        }

        temp.prev = null;
        
    }
    public void printLL(){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data+"<=>");
            temp = temp.next;
        }
        System.out.println("null");
    }



    public static void main(String[] args) {
        DoublyLL ll = new DoublyLL();

        ll.pushFront(10);
        ll.pushFront(20);
        ll.printLL();
        ll.pushBack(30);
        ll.pushBack(40);
        ll.printLL();
        ll.popBack();
        ll.printLL();
        ll.popFront();
        ll.printLL();
        
    }
}
