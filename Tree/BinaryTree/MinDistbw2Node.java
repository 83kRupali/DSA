class MinDistbw2Node{

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

    public static Node lca(Node root, int n1, int n2){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftlca = lca(root.left, n1, n2);
        Node rightlca = lca(root.right, n1, n2);

        if(rightlca == null){
            return leftlca;
        }

        if(leftlca == null){
            return rightlca;
        }

        return root;
    }

    public static int minDistbw2Node(Node root, int n1, int n2){
        Node lca = lca(root, n1, n2);

        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1+dist2;

    }

    public static int lcaDist(Node root, int n){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return  -1;
        }
        else if(leftDist == -1){
            return rightDist+1;
        }
        else{
            return leftDist+1;
        }
    }
    public static void main(String args[]){
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

        System.out.println(minDistbw2Node(root1, 4,7));
        System.out.println(minDistbw2Node(root1, 4,5));
        System.out.println(minDistbw2Node(root1, 4,3));
    }
}