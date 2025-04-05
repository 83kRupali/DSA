public class KthSmallestEleBST {

    static class Node  {
        int data;
        Node left;
        Node right;
        
        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null; 
        }
    }

    static int count = 0;
    public static void kthSmallestEleBST(Node root, int k) {
        Node res = getkthSmallestEleBST(root, k);

        if(res == null){
            System.out.println("There are less than k nodes in the BST..");
        }
        else{
            System.out.println("k-th Smallest Element is:"+ res.data);
        }   
    }

    public static Node getkthSmallestEleBST(Node root, int k){
        if(root == null) return null;

        Node left = getkthSmallestEleBST(root.left, k);

        if(left != null){
            return left;
        }

        if(count == k){
            return root;
        }

        
        // Node right = getkthSmallestEleBST(root.right, k);

        // if(right != null){
        //     return right;
        // }

        // BeCause altmate goal null or not pass the right so for this
        return getkthSmallestEleBST(root.right, k);
    }
    
    public static void main(String[] args) {
        Node root = new Node(8);
        root.left = new Node(5);
        root.left.left = new Node(3);
        root.left.right = new Node(6);

        root.right = new Node(11);
        root.right.right = new Node(20);
    }
}
