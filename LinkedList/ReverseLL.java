//package Apna_College.LinkedList;

import java.util.LinkedList;

public class ReverseLL {
    Node head;
    class Node{
        int data ;
        Node next;

        Node (int data){
            this.data = data;
            next = null;
        }
    } 

    ReverseLL(){
        head = null;
    }
    public void push(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode = temp;
        }
    }

    public void printLL(){
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data +"->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void reverseLL(){
        if(head == null){
            return ;
        }

        Node next = null;
        Node current = head;
        Node prev = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        ReverseLL ll = new ReverseLL();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.printLL();
        ll.reverseLL();
        ll.printLL();
    }
}
