public class LinkedListAddOne {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static Node linklistAddOne(Node head){
        if(head == null){
            return null;
        }

        head = reverse(head);

        Node curr = head;

        int carry = 1;
        Node prev = null;

        while(curr != null){
            int sum = curr.data + carry;
            curr.data = sum%10;

            carry = sum / 10;

            prev = curr;
            curr = curr.next;
        }

        if(carry > 0){
            prev.next = new Node(carry);
        }

        return reverse(head);
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(3);

        Node val = linklistAddOne(head);

        while (val != null) {
            System.out.print(val.data);
            val = val.next;
        }
    }
}