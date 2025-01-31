public class ReverseDLL {

    public static void reverseDLL(Node head){
        if(head == null) return;

        Node curr = head;
        Node prev = null;
        
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            curr.prev = next;
            prev = curr;
            curr = next;
        }
    }
    public static void main(String[] args) {
        
    }
}
