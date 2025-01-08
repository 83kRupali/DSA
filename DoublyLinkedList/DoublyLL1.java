//package Apna_College.DoublyLL;

public class DoublyLL1 {

    Node head;
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

    DoublyLL1(){
        head = null;
    }

    public void pushFront(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        
    }

    public void pushBack(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            newNode.prev = temp;
            temp.next = newNode;
            temp = newNode;
        }
    }

    public void popFront(){
        
        Node temp = head;
        head = head.next;
        head.prev = null;
        temp.next = null;
    }

    public void popBack(){
        if(head == null){
            return;
        }

        Node temp = head;
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;

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
        DoublyLL1 ll = new DoublyLL1();
        ll.pushFront(10);
        ll.pushFront(20);
        ll.printLL();
        ll.pushBack(30);
        ll.pushBack(40);
        ll.printLL();
        ll.popFront();
        ll.printLL();
        ll.popFront();
        ll.printLL();
        ll.popBack();
        ll.printLL();
        ll.pushBack(20);
        ll.pushFront(30);
        ll.printLL();
        ll.popBack();
        ll.printLL();
        ll.popFront();
        ll.printLL();
    }
}
