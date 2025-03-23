
public class LowestCommonAncestor2 {
     static class  Node {
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }


    // tC:O(n)
    // SC:O(n)

    public static Node lowestCommonAncestor(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftlca = lowestCommonAncestor(root.left, n1, n2);
        Node rightlca = lowestCommonAncestor(root.right, n1, n2);

        if(rightlca == null){
            return leftlca;
        }

        if(leftlca == null){
            return rightlca;
        }

        return root;
    }

    public static void main(String[] args) {

        /*
         *              1
         *            /   \
         *           2     3
         *         /  \   /  \
         *        4    5 6    7
         * 
         */
        Node root1 = new Node(1);
        root1.left  = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);

        System.out.println(lowestCommonAncestor(root1, 4,7).data);
        System.out.println(lowestCommonAncestor(root1, 4,5).data);
        System.out.println(lowestCommonAncestor(root1, 4,3).data);
    }
}
