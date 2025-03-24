public class RotateLinkedList {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    } 

    public static Node rotateLinkedList(Node head, int k){
        if(head == null || head.next == null || k == 0){
            return head;
        }

        Node temp = head;
        int count = 1;

        while (temp.next != null) {
            temp = temp.next;
            count++;
        }

        k = k % count;

        if(k == 0){
            return head;
        }

        Node curr = head;

        for(int i=1; i<k; i++){
            curr = curr.next;
        }

        Node newHead = curr.next;
        curr.next = null;
        temp.next = head;
        
        return newHead;
    }
    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(3);
        head.next.next = new Node(4);
        head.next.next.next = new Node(5);

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();

        System.out.println("After Rotation :");
        Node ans = rotateLinkedList(head, 3);
        Node curr = ans;
        while (curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
}
