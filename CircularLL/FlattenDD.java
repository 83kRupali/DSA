public class FlattenDD {

    //430 :flatten a multilevel Doubly Linked List

    // TC : O(n)
    public static void Node flattenDD(Node head){
        if(head == null) return null;

        Node curr = head;
        while(curr != null){
            if(curr.child != null){
                //flattern the child Nodes;

                Node next = curr.next;

                curr.next = (curr.child);
                curr.next.prev = curr;

                curr.child = null;

                //find tail

                while(curr.next != null){
                    curr = curr.next;
                }

                // attach tail with next pair

                if(curr != null){
                    curr.next = next;
                    next.prev = curr;
                }

                curr =curr.next;
            }
            return head;
        }
    }
    public static void main(String[] args) {
        
    }
}