public class DeleteBST {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left, val);
        }
        else{
            root.right = insert(root.right, val);
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

    public static Node deleteNode(Node root, int val){
        if(root.data > val){
            root.left = deleteNode(root.left, val);
        }
        else if(root.data < val){
            root.right = deleteNode(root.right, val);
        }
        else{

            // case-1 ---> leaf node
            if(root.left == null && root.right == null){
                return null;
            }

            // case-2 --->  only one node

            if(root.left == null){
                return root.right;
            }
            else if(root.right == null){
                return root.left;
            }

            Node IS = inOrderSuccessor(root.right);

            root.data = IS.data;

            root.right = deleteNode(root.right, IS.data);
        }

        return root;
    }

    public static Node inOrderSuccessor(Node root){
        while (root.left != null) {
            root = root.left;
        }

        return root;
    }
    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};

        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();

       // deleteNode(root, 6);
        inOrder(root);
        System.out.println();

        deleteNode(root, 10);
        inOrder(root);
        System.out.println();

        deleteNode(root, 5);
        inOrder(root);
        System.out.println();

    }
}
