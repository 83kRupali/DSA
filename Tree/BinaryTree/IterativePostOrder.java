import java.util.Stack;

public class IterativePostOrder {

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

    public static void iterativePostOrder(Node root){
        Stack<Node>st = new Stack<>();

        Node prev = null;

        while(root != null || !st.isEmpty()){
            while(root != null){
                st.push(root);
                root = root.left;
            }
           
            root = st.peek();
            
            if(root.right != null && root.right != prev){
                root = root.right;
            }
            else{
                System.out.print(root.data+" ");
                st.pop();
                prev = root;
                root = null;
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
        iterativePostOrder(root);
    }
}
