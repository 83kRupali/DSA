
public class SwapPairsLL {

    // 24 : Swap Nodes in Pairs
    // TC: O(n)
    // SC: O(1)

    public static Node swapPairsLL(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node first = head;
        Node second = head.next;
        Node prev = null;

        while(first != null && second != null){
            Node third = second.next;
            second.next = first;
            first.next = third;

            if(prev != null){
                prev.next = second;
            }
            else{
                head = second;
            }
            
            prev = first;
            first = third;
            
            if(third != null){
                second = third.next;
            }
            else{
                second = null;
            }
        }
        return head;
    }
    public static void main(String[] args) {
        
    }
}
