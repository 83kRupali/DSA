// leetcode 142

public class CycleDetectedInLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public CycleDetectedInLL() {
        head = null;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode; // Append the new node to the end of the list
        }
    }

    public void createCycle(int pos) {
        if (head == null || pos < 0) {
            return;
        }

        Node temp = head;
        Node cycleNode = null;
        int index = 0;

        while (temp.next != null) {
            if (index == pos) {
                cycleNode = temp; // Mark the node where the cycle will start
            }
            temp = temp.next;
            index++;
        }

        if (cycleNode != null) {
            temp.next = cycleNode; // Create a cycle
        }
    }

    public void printLL() {
        if (head == null) {
            return;
        }

        Node temp = head;
        int count = 0; // Limit iterations to prevent infinite loop in case of a cycle
        while (temp != null && count < 20) {
            System.out.print(temp.data + "->");
            temp = temp.next;
            count++;
        }
        System.out.println("...");
    }

    public Node cycleDetectedInLL(Node head) {
        Node slow = head;
        Node fast = head;
        boolean isCycled = false;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isCycled = true;
                break;
            }
        }

        if (!isCycled) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        CycleDetectedInLL ll = new CycleDetectedInLL();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(50);

        // Create a cycle (e.g., last node points to the node with data 30)
        ll.createCycle(2);

        // Uncomment to see the list structure (limited to prevent infinite loop)
        // ll.printLL();

        Node cycleNode = ll.cycleDetectedInLL(ll.head);
        if (cycleNode != null) {
            System.out.println("Cycle Present at Node with Data: " + cycleNode.data);
        } else {
            System.out.println("No Cycle Present");
        }
    }
}
