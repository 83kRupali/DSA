Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        
        
        while(curr != null){
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    
    Node compute(Node head) {
        // your code here
        
        if(head == null || head.next == null) return head;
        // ------------------------------
        // ArrayList<Integer>arr = new ArrayList<>();
        
        // while(head != null){
        //     arr.add(head.data);
        //     head = head.next;
        // }
        
        // int n = arr.size();
        // for(int i=n-2; i>=0; i--){
        //     if(arr.get(i+1)>arr.get(i)){
        //         arr.remove(arr.get(i));
        //     }
        // }
        
        // Node dummy = new Node(-1);
        // Node curr = dummy;
        
        // for(int i=0; i<arr.size(); i++){
        //     curr.next = new Node(arr.get(i));
        //     curr = curr.next;
        // }
        
        // return dummy.next;
        // --------------------------------------
        head = reverse(head);
        
        Node curr = head;
        Node maxNode = head;
        
        while(curr != null && curr.next != null){
            if(curr.next.data < maxNode.data){
                // delete curr.next
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
                maxNode = curr;
            }
        }
        head = reverse(head);
        return head;
    }
