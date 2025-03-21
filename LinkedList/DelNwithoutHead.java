public class DelNwithoutHead {

    static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static void delNWithoutHead(Node node){
        if(node == null){
            return;
        }

        if(node.next == null){
            return;
        }

        node.data = node.next.data;
        node.next = node.next.next;
    }

    public static void printLL(Node node){
        if(node == null){
            return;
        }

        Node curr = node;

        while(curr != null){
            System.out.print(curr.data +" ");
            curr = curr.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        root.next = new Node(20);
        root.next.next = new Node(30);

        printLL(root);
        delNWithoutHead(root.next);
        printLL(root);
    }
}