public class MirrorImageBST {
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

    // Time Complexity : O(n)

    public static Node mirrorImageBST(Node root){
        if(root == null) return null;

        Node leftMirror = mirrorImageBST(root.left);
        Node rightMirror = mirrorImageBST(root.right);

        root.left = leftMirror;
        root.right = rightMirror;

        return root;
    }

    public static void main(String[] args) {
        int values[] = {5,1,3,4,2,7};

        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root, values[i]);
        }
        inOrder(root);
        System.out.println();
        
        root = mirrorImageBST(root);


    }
}
