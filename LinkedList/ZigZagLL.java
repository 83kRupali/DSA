import java.util.LinkedList;

public class ZigZagLL {

    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node zigZagLL(Node head){

        if(head == null || head.next == null){
            return head;
        }

        // find mid
        Node mid = getMid(head);

        //reverse 2nd half
        Node rightNode = mid.next;
        Node prev = null;
        while(rightNode != null){
            Node next = rightNode.next;
            rightNode.next = prev;
            prev = rightNode;
            rightNode = next;
        }

        // alt merge --> zigzag merge

        Node Lhead = head;
        Node Rhead = prev;

        while (Lhead != null && Rhead != null) {
            Node nextL = Lhead.next;
            Lhead.next = Rhead;
            Node nextR = Rhead.next;
            Rhead.next = nextL;

            Lhead = nextL;
            Rhead = nextR;
        }

        return head;
    }

    public Node getMid(Node head){
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;   
        }

        return slow;
    }

    public void print(){
        Node curr = head;

        while(curr != null){
            System.out.print(curr.data +"->");
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {

      //  ZigZagLL l = new ZigZagLL();
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(30);
        ll.add(40);
        ll.add(50);
        ll.add(60);

    

    }
}
