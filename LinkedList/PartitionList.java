public ListNode partition(ListNode head, int x) {
        if(head == null || head.next == null) return head;

        ListNode less = new ListNode(0);
        ListNode greater = new ListNode(0);
        
        ListNode head1 = less;
        ListNode head2 = greater;

        while(head != null){
           
            if(head.val<x){
                head1.next = head;
                head1 = head1.next;
            }
            else{
                head2.next = head;
                head2 = head2.next;
            }
            head = head.next;
        }

        head2.next = null;
        head1.next = greater.next;
        
        return less.next;
    }
