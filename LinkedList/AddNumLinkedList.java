public class AddNumLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node reverse(Node root){
        Node curr = root;
        Node prev = null;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static void addNumLinkedList(Node head1 , Node head2) {
    
        head1 = reverse(head1);
        head2 = reverse(head2);

        Node dummyHead = new Node(0);
        Node temp = dummyHead;
        int carry = 0;

        while (head1 != null || head2 != null || carry  >= 1) {
            int sum = carry;
            
            if(head1 != null){
                sum += head1.data;
                head1 = head1.next;
            }

            if(head2 != null){
                sum += head2.data;
                head2 = head2.next;
            }

            temp.next = new Node(sum % 10); 
            temp = temp.next;

            carry = sum/10;
        }

        Node result = reverse(dummyHead.next);

        // if(result.data == 0){
        //     return result.next;
        // }

        Node curr = result;

        while (curr != null) {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();

    }
    public static void main(String[] args) {
        Node head1 = new Node(2);
        head1.next = new Node(10);
        head1.next.next = new Node(5);



        Node head2 = new Node(4);
        head2.next = new Node(6);

        // 2 -> 10 -> 5
        //       4 -> 6
        // 3 -> 5 -> 1        

        addNumLinkedList(head1, head2);
    }
}
