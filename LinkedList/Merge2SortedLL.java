public class Merge2SortedLL {

    //Time Complexity : O(n+m)
    //leetcode : 21;

    public Node merge2SortedLL(Node head1, Node head2){
        if(head1 == null || head2 == null){
            return head1 == null ? head2:head1;
        }

        if(head1.data <= head2.data){
            head1.next = merge2SortedLL(head1.next, head2);
            return head1;
        }
        else{
            head2.next = merge2SortedLL(head1, head2.next);
            return head2;
        }
    }
    public static void main(String[] args) {
        
    }
}
