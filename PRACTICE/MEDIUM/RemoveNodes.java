  public ListNode removeNodes(ListNode head) {
        ArrayList<Integer>arr = new ArrayList<>();

        while(head != null){
            arr.add(head.val);
            head = head.next;
        }

        for(int i=arr.size()-2; i>=0; i--){
            if(arr.get(i) < arr.get(i+1)){
                arr.remove(i);
            }
        }

        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for(int i=0; i<arr.size(); i++){
            curr.next = new ListNode(arr.get(i));
            curr = curr.next;
        }

        return dummy.next;
    }
