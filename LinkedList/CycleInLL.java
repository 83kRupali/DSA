//leetcode : 141

class CycleInLL {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public CycleInLL() {
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

        // Create a cycle by pointing the last node to the cycleNode
        if (cycleNode != null) {
            temp.next = cycleNode;
        }
    }

    public void printLL() {
        if (head == null) {
            return;
        }

        Node temp = head;
        int count = 0; // Limit the number of iterations to prevent infinite loop
        while (temp != null && count < 20) { // Print only a limited number of nodes
            System.out.print(temp.data + "->");
            temp = temp.next;
            count++;
        }
        System.out.println("...");
    }

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

    public static void main(String[] args) {
        CycleInLL ll = new CycleInLL();
        ll.push(10);
        ll.push(20);
        ll.push(30);
        ll.push(40);
        ll.push(50);

        // Create a cycle (e.g., 50 -> 30)
        ll.createCycle(2);

        // Uncommenting this will print infinite loop due to cycle
        // ll.printLL();

        System.out.println("Cycle Present: " + ll.isCycled(ll.head));
    }
}
