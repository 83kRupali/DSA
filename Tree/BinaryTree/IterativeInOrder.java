import java.util.Stack;

public class IterativeInOrder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void iterativeInOrder(Node root){
        Stack<Node>st = new Stack<>();

        while(root != null || !st.isEmpty()){
            if(root != null){
                st.push(root);
                root = root.left;
            }
            else{
                root = st.pop();
                System.out.print(root.data +" ");
                root = root.right;
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(3);
        root.right = new Node(5);

        root.left.left = new Node(4); 
        root.left.right = new Node(9);

        root.right.left = new Node(7);
        root.right.right = new Node(2);
        iterativeInOrder(root);
    }
}
