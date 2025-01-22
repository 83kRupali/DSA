//import CycleRemoveInLL.Node;

public class ReverseNodeKgruop {

    public void reverseNodeKgruop(Node head, int k){

        Node temp = head;
        int count = 0;
        
        //check if k nodes exist 
        while(count < k){
            if(temp == null){
                return head;
            }
            temp = temp.next;
            count++;
        }

        //recursively calls for rest of LL
        Node preNode = reverseNodeKgruop(temp, k);

        //reverse current group

        Node temp = head;
        count = 0;
        while(count < k){
            Node next = temp.next;
            temp.next = preNode;
            preNode = temp;
            temp = next;
            count++; 
        }
        return preNode;

    }
    public static void main(String[] args) {
        
    }
}
