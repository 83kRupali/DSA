public class DeleteLeafNode {

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

    public static Node deleteNode(Node root, int x){
        if(root == null){
            return root;
        }

        root.left = deleteNode(root.left, x);
        root.right = deleteNode(root.right, x);

        if(root.data == x && root.left == null && root.right == null){
            return null;
        }

        return root;
    }

    public static void inOrder(Node root){
        if(root == null){
            return;
        }

        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(3);
        root.right = new Node(3);

        root.left.left = new Node(3);
        root.left.right = new Node(2);

        inOrder(root);
        System.out.println();
        deleteNode(root, 3);
        inOrder(root);


    }
}
