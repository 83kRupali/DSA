public ListNode deleteDuplicates(ListNode head) {

        if(head == null || head.next == null) return head;

        ListNode curr = head;

        HashMap<Integer, Integer>map = new HashMap<>();

        while(curr != null){
            map.put(curr.val, map.getOrDefault(curr.val, 0)+1);
            curr = curr.next;
        }

        ListNode dummy = new ListNode(-1);
        curr = dummy;

        while(head != null){
            if(map.get(head.val) == 1){
                curr.next = new ListNode(head.val);
                curr = curr.next;
                head = head.next;
            }
            else{
                head = head.next;
            }
        }
        return dummy.next;
    }
