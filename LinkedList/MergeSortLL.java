
import java.util.LinkedList;

public class MergeSortLL {

    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public Node mergeSortLL(Node head){
        if(head != null || head.next != null){
            return head;
        }

        //mid
        Node mid = getMid(head);

        // left & right MS

        Node rightHead = mid.next;
        mid.next = null;

        Node newLeft = mergeSortLL(head);
        Node newRight = mergeSortLL(rightHead);

        return mergeLL(newLeft, newRight);
        
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

    public Node mergeLL(Node head1, Node head2){
        Node mergeLL = new Node(-1);
        Node temp = mergeLL;

        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        } 
        
        while (head2 != null) {
            temp.next = head2;
            head1 = head2.next;
            temp = temp.next;
        }

        return mergeLL.next;
    }

    public void print(){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+"->");
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.add(10);
        ll.add(20);
        ll.add(60);
        ll.add(30);

        ll.print();
        ll.head = ll.mergeSortLL(ll.head);
        ll.print();
    }
}
