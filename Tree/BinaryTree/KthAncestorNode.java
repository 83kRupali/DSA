public class KthAncestorNode {

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

    public static int kthAncestorNode(Node root, int n, int k){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = kthAncestorNode(root.left, n, k);
        int rightDist = kthAncestorNode(root.right, n, k);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }

        int max = Math.max(leftDist, rightDist);

        if(k == max+1){
            System.out.println(root.data);
        }

        return max+1;
    }
    public static void main(String[] args) {
        /*
         *              1
         *            /   \
         *           2     3
         *         /   \   /  \
         *        4     5 6    7
         * 
         */

         Node root = new Node(1);
         root.left = new Node(2);
         root.right = new Node(3);
         
         root.left.left = new Node(4);
         root.left.right = new Node(5);

         root.right.left = new Node(6);
         root.right.right = new Node(7);

         System.out.println(kthAncestorNode(root, 5, 2));
         System.out.println(kthAncestorNode(root, 4, 1));
         System.out.println(kthAncestorNode(root, 6, 1));

    }
}
