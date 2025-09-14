 public static Node moveToFront(Node head) {
        // code here
        if(head == null || head.next == null){
            return head;
        }
        
        Node curr = head;
        while(curr.next.next != null){
            curr = curr.next;
        }
        
        Node temp = curr.next;
        temp.next = head;
        curr.next = null;
        return temp;
        
    }
