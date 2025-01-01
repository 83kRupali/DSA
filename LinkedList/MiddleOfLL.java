
// Middle of the LinkedList
// Time Complexity: O(n)
// Space Complexity: O(1)

public class MiddleOfLL {
    Node head;
    
    class Node{
        int data ;
        Node next;

        Node (int data){
            this.data = data;
            next = null;
        }
    } 

    MiddleOfLL(){
        head = null;
    }
    public void push(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }
        else{
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
            newNode = temp;
        }
    }

    public void printLL(){
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data +"->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public Node middleOfLL(Node head){
        if(head == null){
            return null;
        }

        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public void middleOfLL1(Node head){
        if(head == null){
            return;
        }

        Node temp = head;
        int idx = 0;
        while(temp != null){
            idx++;
            temp = temp.next;
        }

        Node temp1 = head;
        int mid = (idx/2)+1;
        int i=0;
        while(temp1 != null){
            i++;
            if(i == mid){
                break;
            }
            temp1 = temp1.next;
        }
        System.out.println(temp1.data);
    }
    public static void main(String[] args) {
        MiddleOfLL ll = new MiddleOfLL();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(50);
        ll.push(60); 
        ll.push(70);
        ll.push(80);
        ll.push(90);
        ll.push(100);
        ll.printLL();
        System.out.println(ll.middleOfLL(ll.head).data);
        ll.middleOfLL1(ll.head);
    }
}
