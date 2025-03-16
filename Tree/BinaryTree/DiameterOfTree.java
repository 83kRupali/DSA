public class DiameterOfTree {

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

    static class BinaryTree {
    
        static int idx = -1;

        // TC:O(n)
        
        public Node buildTree(int nodes[]){
            idx++;

            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }
    }


    //TC:O(n)
    public static int heightOfTree(Node root){

        if(root == null){
            return 0;
        }

        int leftSubTree = heightOfTree(root.left);
        int rightSubTree = heightOfTree(root.right);
       
        int height = Math.max(leftSubTree, rightSubTree)+1;
        return height;
    }

    //O(n^2)

    public static int diameterOfTree(Node root){
        if(root == null){
            return 0;
        }

        int leftDiam = diameterOfTree(root.left);
        int leftHeight = heightOfTree(root.left);
        int rightDiam = diameterOfTree(root.right);
        int rightHeight = heightOfTree(root.right);

        int selfDiam = leftHeight+rightHeight+1;

        return Math.max(selfDiam, Math.max(leftDiam,rightDiam));
    }
    public static void main(String[] args) {
        int nodes[] = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        System.out.println(diameterOfTree(root));
        
    }
}
