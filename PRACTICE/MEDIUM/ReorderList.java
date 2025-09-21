public ListNode reverse(ListNode head){
        ListNode next = null;
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void reorderList(ListNode head) {

        if(head == null || head.next == null) return;

        // 1. Find middle
        ListNode slow = head, fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        // 2. Reverse second half
        ListNode second = reverse(slow.next);
        slow.next = null;

        // 3. Merge two halves
        ListNode first = head;
        
        while(second != null){
            // dummy.next = curr2.next;
            // dummy = dummy.next;
            // curr2 = curr2.next;
            // dummy.next = curr1;
            // curr1 = curr1.next;
            // dummy = dummy.next;

            ListNode temp1 = first.next;
            ListNode temp2 = second.next;

            first.next = second;
            second.next = temp1;

            first = temp1;
            second = temp2;
        }
    }
