import CycleRemoveInLL.Node;

public class PalindromeLL {

    public static Node findMid(Node head){
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    public static boolean palindromeLL(Node head){
        if(head == null || head.next == null){
            return true;
        }

        // Step1 - find mid

        Node midNode = findMid(head);

        // step2 - reverse 2nd half

        Node prev = null;
        Node curr = midNode;
        Node next = null;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr ;
            curr = next;  
        }

        Node right = prev;
        Node left =  head;

        // step3 - check left healf & right half   
        
        while (right != null) {
            if(left.data != right.data){
                return false;
            }

            left = left.next;
            right = right.next;

        }
        return true;
    }
    public static void main(String[] args) {
        
    }
}
