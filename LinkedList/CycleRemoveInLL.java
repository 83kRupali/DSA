public class CycleRemoveInLL {
    Node head;

    // Node class
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Constructor
    public CycleRemoveInLL() {
        head = null;
    }

    // Method to push data into the linked list
    public void push(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode; // Append the new node at the end
    }

    // Method to print the linked list safely
    public void printLL() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        int count = 0; // Safeguard against infinite loops
        while (temp != null && count < 100) { // Limit iterations to detect cycles
            System.out.print(temp.data + " -> ");
            temp = temp.next;
            count++;
        }
        if (temp != null) {
            System.out.println("Cycle detected");
        } else {
            System.out.println("null");
        }
    }

    // Method to check if the linked list contains a cycle
    public boolean isCycled(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // Method to remove a cycle in the linked list
    public void cycleRemoveInLL(Node head) {
        Node slow = head;
        Node fast = head;
        boolean isCycled = false;

        // Detect cycle
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                isCycled = true;
                break;
            }
        }

        // If no cycle, return
        if (!isCycled) {
            return;
        }

        // Remove cycle
        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }
        prev.next = null; // Break the cycle
    }

    public static void main(String[] args) {
        CycleRemoveInLL ll = new CycleRemoveInLL();

        // Add elements to the linked list
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(50);

        // Manually create a cycle for testing
        ll.head.next.next.next.next.next = ll.head.next.next; // 50 -> 30

        // Check for cycle
        System.out.println("Cycle Present: " + ll.isCycled(ll.head));

        // Remove the cycle
        ll.cycleRemoveInLL(ll.head);

        // Check for cycle again
        System.out.println("Cycle Removed: " + ll.isCycled(ll.head));

        // Print the list
        ll.printLL();
    }
}
